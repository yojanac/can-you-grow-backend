package com.canyougrow.backend.repository;

import com.canyougrow.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>
{}

