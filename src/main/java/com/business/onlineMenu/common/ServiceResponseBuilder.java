package com.business.onlineMenu.common;

public class ServiceResponseBuilder {

  public <T> ServiceResponse<T> build(T dto){
    ServiceResponse<T> response = new ServiceResponse<T>();
    response.setStatus(Status.OK);
    response.setPayload(dto);
    return response;
  }
}
