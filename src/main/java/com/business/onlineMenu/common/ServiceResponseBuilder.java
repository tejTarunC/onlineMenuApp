package com.business.onlineMenu.common;

import org.springframework.stereotype.Component;

@Component
public class ServiceResponseBuilder {

  public static <T> ServiceResponse<T> build(T dto) {
    ServiceResponse<T> response = new ServiceResponse<T>();
    response.setStatus(Status.OK);
    response.setPayload(dto);
    return response;
  }
}
