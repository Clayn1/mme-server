package com.clayn.mmeserver.controller;

import com.clayn.mmeserver.model.Profile;
import com.clayn.mmeserver.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class ProfileController {
    @Autowired
    private IProfileService profileService;

    @RequestMapping(path = "/{username}", method = RequestMethod.GET)
    public Profile getProfile(@PathVariable String username){
        return profileService.getProfile(username);
    }
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Profile createModPage(@RequestBody Profile profile){
        return profileService.insertProfile(profile);
    }

    @RequestMapping(path = "/{username}", method = RequestMethod.PUT)
    @ResponseStatus
    public Profile updateModPage(@RequestBody Profile profile, @PathVariable String username){
        profile.setUsername(username);
        return profileService.updateProfile(profile);
    }
}
