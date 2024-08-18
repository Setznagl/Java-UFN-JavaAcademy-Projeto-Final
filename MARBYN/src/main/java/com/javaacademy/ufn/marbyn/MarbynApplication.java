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
import java.util.List;

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

	public List<Smartphone> builderList(Smartphone parameter){
		List<Smartphone> smartphoneList = new ArrayList<>();
		smartphoneList.add(parameter);
		return smartphoneList;
	}

	@Override
	public void run(String... args) {

		Smartphone Tsmartphone1 =
				Smartphone.builder()
						.brand("Motorola G04")
						.build();
		smartphoneRepository.save(Tsmartphone1);

		SysUser Tuser1 =
				SysUser.builder()
						.name("Medeia")
						.email("Medeia@meow.com")
						.password("123456")
						.build();
		sysUserRepository.save(Tuser1);

		UserProfile Tprofile1 =
				UserProfile.builder()
						.fk_user(Tuser1)
						.userSmartphones(builderList(Tsmartphone1))
						.build();
		userProfileRepository.save(Tprofile1);


		System.out.println("Test User Status");
		System.out.println(Tuser1.getId());
		System.out.println(Tuser1.getName());
		System.out.println(Tuser1.getEmail());
		System.out.println(Tuser1.getPassword());
		System.out.println(" ");

		System.out.println("Test Smartphone Status");
		System.out.println(Tsmartphone1.getId());
		System.out.println(Tsmartphone1.getBrand());
		System.out.println(" ");

		System.out.println("Test User Profile Status");
		System.out.println(Tprofile1.getId());
		System.out.println(Tprofile1.getFk_user());
		System.out.println(" ");
    }

}