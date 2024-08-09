package com.marvel.lan.application;

import com.marvel.lan.types.common.Result;

public interface DemoService {

    Result<Boolean> test(Long UserId) throws Exception;

}
