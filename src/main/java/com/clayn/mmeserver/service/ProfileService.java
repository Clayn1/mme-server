package com.clayn.mmeserver.service;

import com.clayn.mmeserver.model.Profile;
import com.clayn.mmeserver.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements IProfileService {
    @Autowired
    ProfileRepository profileRepository;

    @Override
    public Profile insertProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile updateProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile getProfile(String username) {
        return profileRepository.getProfileByUsername(username);
    }
}
