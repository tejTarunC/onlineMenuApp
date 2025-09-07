package com.business.onlineMenu.repository;

import com.business.onlineMenu.model.AddOn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddOnRepository extends JpaRepository<AddOn, Long> {
}
