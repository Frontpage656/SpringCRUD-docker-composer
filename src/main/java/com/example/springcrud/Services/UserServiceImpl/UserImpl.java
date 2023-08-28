package com.example.springcrud.Services.UserServiceImpl;

import com.example.springcrud.Entity.User;
import com.example.springcrud.Repository.UserRepository;
import com.example.springcrud.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {

        Optional<User>optionalUser = userRepository.findById(userId);

        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User upateUser(User user) {

        User existingUuser = userRepository.findById(user.getId()).get();
        existingUuser.setFirstName(user.getFirstName());
        existingUuser.setSecondName(user.getSecondName());
        existingUuser.setGender(user.getGender());
        existingUuser.setEmail(user.getEmail());

        return userRepository.save(existingUuser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
