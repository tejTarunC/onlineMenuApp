package com.business.onlineMenu.dto;

import com.business.onlineMenu.enums.Category;
import lombok.Data;

import java.util.List;

@Data
public class ItemDTO {
  private String itemId;

  private String itemName;

  private String item_description;

  private Long item_price;

  private Boolean item_availability;

  private Category itemCategory;

  private List<PortionOptionDTO> portionOption;

  private List<AddOnDTO> addOns;

}
