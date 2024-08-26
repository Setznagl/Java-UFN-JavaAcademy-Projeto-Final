package com.javaacademy.ufn.marbyn.Controller.UserProfileController;

import com.javaacademy.ufn.marbyn.Model.Survey.Survey;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.SysUser;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.UserProfile;
import com.javaacademy.ufn.marbyn.Repository.UserProfileRepository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileCreation {

    @Autowired
    UserProfileRepository userProfileRepository;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserProfile createUserProfile(@RequestBody SysUser sysUser , Survey survey) {
        UserProfile tmpUserProfile = UserProfile.builder()
                .fk_user(sysUser)
                .fk_smartphone_id(0L)
                .build();

        return userProfileRepository.save(tmpUserProfile);
    }

}
