package com.marvel.lan.application.impl;

import com.marvel.lan.application.DemoService;
import com.marvel.lan.types.common.Result;

public class DemoServiceImpl implements DemoService {

    public Result<Boolean> test(Long UserId) throws Exception {
        return Result.success(true);
    }

}
