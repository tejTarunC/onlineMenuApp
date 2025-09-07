package com.business.onlineMenu.model;

import com.business.onlineMenu.enums.Category;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "items")
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String itemName;

  private String item_description;

  private Long item_price;

  private Boolean item_availability;

  @Column(name = "image_id")
  private Long itemImageId;

  @Enumerated(EnumType.STRING)
  private Category itemCategory;

  @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
  private List<PortionOption> portionOption;

  @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
  private List<AddOn> addOns;

  @ManyToOne
  @JoinColumn(name = "menu_id")
  private Menu menu;
}
