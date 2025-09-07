package com.business.onlineMenu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
  private String userName;

  private String emailId;

  private String passwordHash;

  private String restaurantId;
}
