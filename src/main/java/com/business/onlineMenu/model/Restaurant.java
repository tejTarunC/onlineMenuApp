package com.business.onlineMenu.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "restaurants")
public class Restaurant {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String ownerName;

  private String ownerPhoneNumber;

  private String email;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "menu_id", referencedColumnName = "id")
  private Menu menu;
}
