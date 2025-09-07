package com.business.onlineMenu.model;

import com.business.onlineMenu.enums.IDType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "owners")
public class Owner {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String ownerName;
  private String phoneNo;
  private String emailId;

  @Enumerated(EnumType.STRING)
  private IDType identity;

  @Column(name = "identity_image_id")
  private Long identityImageId;

  @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
  private List<Restaurant> restaurants;
}
