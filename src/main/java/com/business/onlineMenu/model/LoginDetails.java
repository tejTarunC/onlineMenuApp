package com.business.onlineMenu.model;

import jakarta.persistence.Column;
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
@Table(name = "login_details")
public class LoginDetails {

  @Id
  @Column(name = "email_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long emailId;

  private String passwordHash;

  @OneToOne
  @JoinColumn(name = "restaurant_id")
  private Restaurant restaurant;
}
