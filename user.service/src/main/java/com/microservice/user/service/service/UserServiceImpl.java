package com.microservice.user.service.service;

import com.microservice.user.service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> list = List.of(
            new User(1311L, "Neha Kumar", "23525625"),
            new User(1312L, "Ankit Rathi", "99999"),
            new User(1314L, "Ravi Singh", "888")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
