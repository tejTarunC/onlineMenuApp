package com.business.onlineMenu.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceResponse<T> implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private Status status = Status.FAIL;

  private ServiceHeader header;

  @JsonProperty("error")
  @SerializedName("error")
  private List<Error> errors;

  private T payload;

  public ServiceResponse(ServiceHeader header, T payload){
    this.header = header;
    this.payload = payload;
  }



}
