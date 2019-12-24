package com.example.jpa.ServiceImpl;

import com.example.jpa.Service.UserProfileService;
import com.example.jpa.model.UserProfile;
import com.example.jpa.repository.UserProfileRepository;
import com.example.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public UserProfile findById(Long id) {
        return userProfileRepository.findById(id).orElse(new UserProfile());
    }

    @Override
    public UserProfile saveUserProfile(UserProfile requestUserProfile) {


        return userProfileRepository.save(requestUserProfile);
    }
}
