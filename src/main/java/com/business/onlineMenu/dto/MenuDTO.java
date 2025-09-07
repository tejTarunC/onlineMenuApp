package com.business.onlineMenu.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MenuDTO {

  private String menuId;

  private List<ItemDTO> items;


}

