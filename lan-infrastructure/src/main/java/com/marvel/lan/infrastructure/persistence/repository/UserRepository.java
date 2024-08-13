package com.marvel.lan.infrastructure.persistence.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.marvel.lan.infrastructure.persistence.po.UserPO;
import com.marvel.lan.infrastructure.persistence.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends ServiceImpl<UserMapper, UserPO> {

}
