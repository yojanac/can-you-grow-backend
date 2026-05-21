package com.canyougrow.backend.service;

import com.canyougrow.backend.dto.SignupReq;
import com.canyougrow.backend.entity.User;
import com.canyougrow.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo ;
    public User signup(SignupReq req)
    {
        User user = new User();
        user.setUsername(req.getUsername());
        user.setPassword(req.getPassword());
        user.setEmail(req.getEmail());

        return repo.save(user);

    }
}
