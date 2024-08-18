package com.javaacademy.ufn.marbyn.Controller.SysUserController;

import com.javaacademy.ufn.marbyn.Model.SysUserModel.SysUser;
import com.javaacademy.ufn.marbyn.Repository.SysUserRepository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserCreation {

    @Autowired
    SysUserRepository sysUserRepository;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public SysUser createSysUser (@RequestBody SysUser sysUser) {
        return sysUserRepository.save(sysUser);
    }
}
