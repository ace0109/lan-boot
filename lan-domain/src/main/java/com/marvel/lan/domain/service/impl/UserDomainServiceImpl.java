package com.marvel.lan.domain.service.impl;

import com.marvel.lan.domain.entity.UserDO;
import com.marvel.lan.domain.service.UserDomainService;
import com.marvel.lan.domain.service.converter.UserConverter;
import com.marvel.lan.infrastructure.persistence.po.UserPO;
import com.marvel.lan.infrastructure.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDomainServiceImpl implements UserDomainService {

    private final UserRepository userRepository;

    @Autowired
    public UserDomainServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDO> getUserList() {
        List<UserPO> userPOList = userRepository.list();

        UserConverter converter = UserConverter.INSTANCE;

        return converter.toDOList(userPOList);
    }

    @Override
    public UserDO createUser(UserDO userDO) {
        return UserConverter.INSTANCE.toDO(userRepository.saveAndReturn(UserConverter.INSTANCE.toPO(userDO)));
    }

    @Override
    public UserDO getUserById(String userId) {
        return UserConverter.INSTANCE.toDO(userRepository.getById(userId));
    }

    @Override
    public Boolean deleteUserById(String userId) {
        return userRepository.removeById(userId);
    }
}
