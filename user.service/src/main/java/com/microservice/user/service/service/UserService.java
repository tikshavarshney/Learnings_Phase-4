package com.microservice.user.service.service;

import com.microservice.user.service.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User getUser(Long id);
}
