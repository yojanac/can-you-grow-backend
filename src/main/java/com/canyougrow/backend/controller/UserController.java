package com.canyougrow.backend.controller;


import com.canyougrow.backend.dto.SignupReq;
import com.canyougrow.backend.entity.User;
import com.canyougrow.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public User signup(@RequestBody SignupReq req)
    {
        return service.signup(req);
    }

}
