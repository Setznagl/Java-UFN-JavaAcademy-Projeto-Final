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
	public void run(String... args) throws Exception {
		Smartphone Tsmartphone1 = Smartphone.builder().brand("Motorola G04").build();

		SysUser Tuser1 = SysUser.builder().name("Tuser1")
		  .email("tuser@gmail.com").password("123456").build();

		UserProfile Tuserprofile1 = UserProfile.builder()
				.mappedUser(Tuser1).recommendation_devices(Tsmartphone1).build();

		smartphoneRepository.save(Tsmartphone1);
		sysUserRepository.save(Tuser1);
		userProfileRepository.save(Tuserprofile1);


	}

}
