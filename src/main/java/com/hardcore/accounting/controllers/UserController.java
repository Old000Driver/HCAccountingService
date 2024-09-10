package com.hardcore.accounting.controllers;

import com.hardcore.accounting.manager.UserInfoManager;
import com.hardcore.accounting.model.common.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1/users")
public class UserController {
    private final UserInfoManager userInfoManager;

    @Autowired
    public UserController(UserInfoManager userInfoManager) {
        this.userInfoManager = userInfoManager;
    }

    @GetMapping("/{id}")
    public UserInfo getUserInfoById(@PathVariable("id") Long userId) {
        return userInfoManager.getUserInfoByUserId(userId);
    }
}
