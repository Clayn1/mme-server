package com.clayn.mmeserver.controller;

import com.clayn.mmeserver.dtos.AuthenticationRequest;
import com.clayn.mmeserver.dtos.AuthenticationResponse;
import com.clayn.mmeserver.model.User;
import com.clayn.mmeserver.service.JwtService;
import com.clayn.mmeserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @PostMapping
    public String registerUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @RequestMapping(path = "/auth", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest authenticationRequest){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
        String token = jwtService.generateToken(authenticationRequest.getUsername());
        return new AuthenticationResponse(token);
    }
}
