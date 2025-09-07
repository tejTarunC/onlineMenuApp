package com.business.onlineMenu.api.impl;

import com.business.onlineMenu.api.AbstractAPI;
import com.business.onlineMenu.api.LoginAPI;
import com.business.onlineMenu.common.ServiceResponse;
import com.business.onlineMenu.common.ServiceResponseBuilder;
import com.business.onlineMenu.dto.LoginRequestDTO;
import com.business.onlineMenu.dto.LoginResponseDTO;
import com.business.onlineMenu.model.Owner;
import com.business.onlineMenu.model.Restaurant;
import com.business.onlineMenu.repository.OwnerRepository;
import com.business.onlineMenu.validator.LoginRequestDTOValidator;
import com.business.onlineMenu.validator.ValidationResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class LoginApiImpl extends AbstractAPI implements LoginAPI {

  @Autowired
  private OwnerRepository ownerRepo;

  @Override
  public ServiceResponse<LoginResponseDTO> login(LoginRequestDTO loginRequest, HttpHeaders headers) throws Exception {
    ValidationResult validation = LoginRequestDTOValidator.validate().apply(loginRequest);
    if(!validation.isValid()){
      throw new Exception(validation.getErrorMessage());
    }
    if(loginRequest.getPhoneNo() != null && loginRequest.getEmailId() != null){
      Optional<Owner> optionalResult = ownerRepo.findByEmailIdAndPhoneNo(loginRequest.getEmailId(), loginRequest.getPhoneNo());
      if(optionalResult.isEmpty()){
        log.info("Owner not present in DB");
        return ServiceResponseBuilder.build(new LoginResponseDTO());
      }
      List<Long> restaurants = optionalResult.get().getRestaurants().stream().map(Restaurant::getId).toList();
      LoginResponseDTO responseDTO = new LoginResponseDTO();
      responseDTO.setRestaurantIds(restaurants);
      return ServiceResponseBuilder.build(responseDTO);
    }
    return null;
  }
}
