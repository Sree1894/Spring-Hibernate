package com.example.jpa.Controller;


import com.example.jpa.Exceptions.ResourceNotFoundException;
import com.example.jpa.Service.UserProfileService;
import com.example.jpa.Service.UserService;
import com.example.jpa.model.User;
import com.example.jpa.model.UserProfile;
import com.example.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/rest/api")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserProfileService userProfileService;

    @Autowired
    UserRepository userRepository;


    @GetMapping("/users")
    public List<User> getAllUser(){
        return userService.findAll();
    }

    //get user  by user id
    @GetMapping("/user/{id}")
    public User getUsers(@PathVariable String id){

        return  userService.findById(id);
    }

    //get user profile by user id
    @GetMapping("/userProfile/{id}")
    public UserProfile getUsersProfile(@PathVariable String id){
        return  userProfileService.findById(Long.valueOf(id));
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }


    @PostMapping("/userProfile/{userId}")
    public UserProfile userProfile(@PathVariable(name = "userId") Long id,@RequestBody UserProfile requestUserProfile){

       Optional<User> user= userRepository.findById(id);
       
       if (user.isPresent()){
           requestUserProfile.setUser(user.get());
           return userProfileService.saveUserProfile(requestUserProfile);
       }else {
           return null;
       }

    }
}
