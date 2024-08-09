package com.marvel.lan.domain.user.service.impl;

import com.marvel.lan.domain.user.service.UserService;
import com.marvel.lan.infrastructure.persistence.DO.UserDO;
import com.marvel.lan.infrastructure.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDO> getAllUsers() {
        return userRepository.list();
    }
}
