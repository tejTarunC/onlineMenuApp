package com.business.onlineMenu.dto;

import lombok.Data;

@Data
public class LoginRequestDTO {

  private String emailId;
  private String phoneNo;
  private String passWordHash;

}
