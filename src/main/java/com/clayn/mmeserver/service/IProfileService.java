package com.clayn.mmeserver.service;

import com.clayn.mmeserver.model.ModPage;
import com.clayn.mmeserver.model.Profile;

public interface IProfileService {
    Profile insertProfile(Profile profile);

    Profile updateProfile(Profile profile);

    Profile getProfile(String username);
}
