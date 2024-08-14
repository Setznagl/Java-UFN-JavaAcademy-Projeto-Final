package com.javaacademy.ufn.marbyn;

import com.javaacademy.ufn.marbyn.Repository.SmartphoneRepository.SmartphoneRepository;
import com.javaacademy.ufn.marbyn.Repository.SysUserRepository.SysUserRepository;
import com.javaacademy.ufn.marbyn.Repository.UserProfileRepository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarbynApplication {

	@Autowired
	SysUserRepository sysUserRepository;

	@Autowired
	UserProfileRepository userProfileRepository;

	@Autowired
	SmartphoneRepository smartphoneRepository;

	public static void main(String[] args) {
		SpringApplication.run(MarbynApplication.class, args);
	}

}
