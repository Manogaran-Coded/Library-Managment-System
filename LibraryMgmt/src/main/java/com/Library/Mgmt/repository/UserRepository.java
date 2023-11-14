package com.Library.Mgmt.repository;

import com.Library.Mgmt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}