package com.business.onlineMenu.dto;

import com.business.onlineMenu.enums.IDType;
import lombok.Data;

import java.util.List;

@Data
public class OwnerDTO {

  private String owner_name;
  private String phone_no;
  private String email_id;
  private IDType identity;
  private String identityImageId;
  List<String> restaurantIds;
}
