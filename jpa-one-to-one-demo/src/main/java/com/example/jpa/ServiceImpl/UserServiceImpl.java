package com.example.jpa.ServiceImpl;

import com.example.jpa.Service.UserService;
import com.example.jpa.model.User;
import com.example.jpa.repository.UserProfileRepository;
import com.example.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserProfileRepository userProfileRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public User findById(String id) {
        return userRepository.findById(Long.valueOf(id)).orElse(new User());
    }

    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }
}
