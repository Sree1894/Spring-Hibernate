package com.example.jpa.Service;


import com.example.jpa.model.User;


import java.util.List;


public interface UserService {

    User findById(String id);

    User saveUser(User user);

    List<User> findAll();
}
