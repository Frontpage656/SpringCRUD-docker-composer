package com.example.springcrud.Repository;

import com.example.springcrud.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
