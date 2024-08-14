package com.javaacademy.ufn.marbyn;

import com.javaacademy.ufn.marbyn.Model.SmartphoneModel.Smartphone;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.SysUser;
//import com.javaacademy.ufn.marbyn.Repository.SmartphoneRepository.SmartphoneRepository;
import com.javaacademy.ufn.marbyn.Repository.SysUserRepository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarbynApplication implements CommandLineRunner {

	@Autowired
	SysUserRepository sysUserRepository;

//	@Autowired
//	SmartphoneRepository smartphoneRepository;

	public static void main(String[] args) {
		SpringApplication.run(MarbynApplication.class, args);
	}

	@Override
	public void run(String... args){
		SysUser teste = SysUser.builder().id(1).name("Testancercio")
				.email("email@email.com").password("12345").build();
		sysUserRepository.save(teste);

//		Smartphone teste1 = Smartphone.builder().id(1).brand("Motorola").build();
//		smartphoneRepository.save(teste1);
	}

}
