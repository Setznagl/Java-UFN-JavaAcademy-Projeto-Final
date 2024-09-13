package com.javaacademy.ufn.marbyn;

import com.javaacademy.ufn.marbyn.Repository.SmartphoneRepository.SmartphoneRepository;
import com.javaacademy.ufn.marbyn.Repository.SysUserRepository.SysUserRepository;
import com.javaacademy.ufn.marbyn.Repository.UserProfileRepository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class MarbynApplication implements CommandLineRunner {

    @Autowired
    SysUserRepository sysUserRepository;

    @Autowired
    UserProfileRepository userProfileRepository;

    @Autowired
    SmartphoneRepository smartphoneRepository;

    public static void main(String[] args) {
        SpringApplication.run(MarbynApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {

//		UserProfile userProfile = UserProfile.builder()
//                .id(0L)
//				.fk_user(sysUserRepository.findById(1L).get())
//				.fk_smartphone(smartphoneRepository.findById(1L).get())
//				.build();
//        userProfileRepository.save(userProfile);
//
//        System.out.println(userProfileRepository.findById(1L));

    }
}