package com.business.onlineMenu.dto;

import lombok.Data;

@Data
public class ItemDTO {
    private String itemId;
    private String itemName;
    private String item_description;
    private Long item_price;
    private Boolean item_availability;
    private PortionOptionDTO portionOption;
    private AddOnDTO addOns;
}
