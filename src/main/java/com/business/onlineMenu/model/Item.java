package com.business.onlineMenu.model;

import com.business.onlineMenu.enums.Category;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
