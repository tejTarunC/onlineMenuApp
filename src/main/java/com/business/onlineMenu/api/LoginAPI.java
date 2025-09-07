package com.business.onlineMenu.api;

import com.business.onlineMenu.common.ServiceResponse;
import com.business.onlineMenu.model.Owner;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


//TODO: enable swagger
@RestController
@RequestMapping("/login")
public interface LoginAPI {

  @GetMapping(value = "email/{userName}/hash/{passwordHash}", produces = APPLICATION_JSON_VALUE)
  ServiceResponse<Owner> login(@PathVariable("userName") String email,
                               @PathVariable("passwordHash") String passwordHash,
                               @RequestHeader HttpHeaders headers
                                  ) throws Exception;

}
