package com.business.onlineMenu.validator;

import com.business.onlineMenu.dto.LoginRequestDTO;

import java.util.function.Function;

public interface LoginRequestDTOValidator extends Function<LoginRequestDTO, ValidationResult> {

  static LoginRequestDTOValidator validate() {
    return (LoginRequestDTO loginRequest) -> {
      StringBuilder message = new StringBuilder();
      if (loginRequest == null) {
        message.append("Login Request cannot be null");
        return new ValidationResult(message.toString());
      }

      if (loginRequest.getEmailId() == null && loginRequest.getPhoneNo() == null) {
        message.append("Both emailId and phoneNo cannot be null");
      }
      return new ValidationResult(message.toString());
    };
  }
}
