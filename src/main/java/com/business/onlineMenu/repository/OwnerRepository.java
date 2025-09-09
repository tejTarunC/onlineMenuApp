package com.business.onlineMenu.repository;

import com.business.onlineMenu.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

  /**
   * Finds an owner by their email.
   *
   * @param emailId The email of the owner.
   * @return An Optional containing the found Owner, or an empty Optional if not found.
   */
  Optional<Owner> findByEmailId(String emailId);
}
