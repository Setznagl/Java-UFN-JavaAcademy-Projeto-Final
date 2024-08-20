package com.javaacademy.ufn.marbyn;

import com.javaacademy.ufn.marbyn.Model.SmartphoneModel.Smartphone;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.SysUser;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.UserProfile;
import com.javaacademy.ufn.marbyn.Repository.SmartphoneRepository.SmartphoneRepository;
import com.javaacademy.ufn.marbyn.Repository.SysUserRepository.SysUserRepository;
import com.javaacademy.ufn.marbyn.Repository.UserProfileRepository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class MarbynApplication implements CommandLineRunner  {

	//implements CommandLineRunner
	@Autowired
	SysUserRepository sysUserRepository;

	@Autowired
	UserProfileRepository userProfileRepository;

	@Autowired
	SmartphoneRepository smartphoneRepository;

	public static void main(String[] args) { SpringApplication.run(MarbynApplication.class, args); }

	@Override
	public void run(String... args) {

		SysUser Tuser = SysUser.builder()
				.id(1L).name(" ").email(" ").password(" ").userProfiles(new ArrayList<>()).build();
		//sysUserRepository.save(Tuser);

		Smartphone Tsmartphone = Smartphone.builder()
				.id(1L).brand("  ")
				.build();
		//smartphoneRepository.save(Tsmartphone);

		UserProfile Tuserprofile = UserProfile.builder()
				.id(1L)
				.fk_user(Tuser)
				.fk_smartphone_id(smartphoneRepository.findById(1L).get().getId())
				.build();
		//userProfileRepository.save(Tuserprofile);

	}

}