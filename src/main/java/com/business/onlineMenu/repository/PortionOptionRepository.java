package com.business.onlineMenu.repository;

import com.business.onlineMenu.model.PortionOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortionOptionRepository extends JpaRepository<PortionOption, Long> {
}
