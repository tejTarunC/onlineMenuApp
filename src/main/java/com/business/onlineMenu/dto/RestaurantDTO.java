package com.business.onlineMenu.dto;

import com.business.onlineMenu.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {

  private String restaurantId;

  private String ownerName;

  private String ownerPhoneNumber;

  private String email;

  private String menuId;

  private MenuDTO menuDTO;

}
