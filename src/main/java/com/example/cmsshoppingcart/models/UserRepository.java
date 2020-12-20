package com.example.cmsshoppingcart.models;

import com.example.cmsshoppingcart.models.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
