package com.example.jpa.Service;


import com.example.jpa.model.User;
import com.example.jpa.model.UserProfile;


public interface UserService {

    User findById(String id);

    User saveUser(User user);
}
