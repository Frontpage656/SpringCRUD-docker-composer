package com.example.springcrud.Services;


import com.example.springcrud.Entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User upateUser(User user);

    void deleteUser(Long userId);

}
