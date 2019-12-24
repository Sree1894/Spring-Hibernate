package com.example.jpa.Service;

import com.example.jpa.model.UserProfile;

public interface UserProfileService {

    UserProfile findById(Long id);

    UserProfile saveUserProfile(UserProfile requestUserProfile);
}
