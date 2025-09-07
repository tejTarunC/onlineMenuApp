package com.business.onlineMenu.dto;

import lombok.Data;

@Data
public class AddOnDTO {
    private String addOnId;
    private String addOnStaple;
    private Long addOnPrice;
    /*
    * [(“chicken”: 25),  (“Veggies”: 20)]
    * make sure addOns don't go unrelated items
    */
}
