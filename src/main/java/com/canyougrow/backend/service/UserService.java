package com.canyougrow.backend.service;

import com.canyougrow.backend.dto.SignupReq;
import com.canyougrow.backend.entity.User;
import com.canyougrow.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo ;
    @Autowired
    private PasswordEncoder encoder;
    public User signup(SignupReq req)
    {
        User user = new User();
        user.setUsername(req.getUsername());
        user.setPassword(encoder.encode(req.getPassword()));
        user.setEmail(req.getEmail());

        return repo.save(user);

    }
}
