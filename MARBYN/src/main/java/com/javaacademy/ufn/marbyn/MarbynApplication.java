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
import java.util.Objects;

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

		Smartphone Tsmartphone1 = Smartphone.builder().id(1).brand("Motorola G04").build();
		Smartphone Tsmartphone2 = Smartphone.builder().id(2).brand("Motorola G14").build();
		SysUser Tuser1 = SysUser.builder().id(1).name("Testinho").email("tuser@gmail.com").password("123456").build();
		UserProfile Tprofile1 = UserProfile.builder().fk_user(Tuser1).fk_smartphone(Tsmartphone1).build();
		UserProfile Tprofile2 = UserProfile.builder().fk_user(Tuser1).fk_smartphone(Tsmartphone2).build();
		UserProfile Tprofile3 = UserProfile.builder().fk_user(Tuser1).fk_smartphone(Tsmartphone1).build();

		smartphoneRepository.save(Tsmartphone1);
		smartphoneRepository.save(Tsmartphone2);
		sysUserRepository.save(Tuser1);
		userProfileRepository.save(Tprofile1);
		userProfileRepository.save(Tprofile2);
		userProfileRepository.save(Tprofile3);

		System.out.println(Tprofile1.getId());
		System.out.println(Tprofile1.getFk_user());
		System.out.println(Tprofile1.getFk_smartphone());
        if(Objects.equals(Tuser1.getId(),Tprofile1.getFk_user().getId())){System.out.println("References Same Element!");
        }else{System.out.println("Doesn't Work!");}

		System.out.println(Tprofile2.getId());
		System.out.println(Tprofile2.getFk_user());
		System.out.println(Tprofile2.getFk_smartphone());
		if(Objects.equals(Tuser1.getId(),Tprofile2.getFk_user().getId())){System.out.println("References Same Element!");
		}else{System.out.println("Doesn't Work!");}

		System.out.println(Tprofile3.getId());
		System.out.println(Tprofile3.getFk_user());
		System.out.println(Tprofile3.getFk_smartphone());
		if(Objects.equals(Tuser1.getId(),Tprofile3.getFk_user().getId())){System.out.println("References Same Element!");
		}else{System.out.println("Doesn't Work!");}
    }

}
