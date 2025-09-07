package com.business.onlineMenu.enums;


import lombok.Getter;

@Getter
public enum Category {
    SOUPS(0),
    STARTERS(1),
    CHINESE(2),
    BIRYANI(3),
    INDIAN_BREAD(4),
    DESSERTS(5),
    BEVERAGE(6);

    private final Integer sequence;
    
    Category(Integer sequence) {
        this.sequence = sequence;
    }

}
