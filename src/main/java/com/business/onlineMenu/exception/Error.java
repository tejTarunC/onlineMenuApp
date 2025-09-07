package com.business.onlineMenu.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class Error implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private String code;
  private String description;

}
