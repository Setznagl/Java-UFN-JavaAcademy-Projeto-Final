package com.javaacademy.ufn.marbyn;

import com.javaacademy.ufn.marbyn.Repository.SmartphoneRepository.SmartphoneRepository;
import com.javaacademy.ufn.marbyn.Repository.SysUserRepository.SysUserRepository;
import com.javaacademy.ufn.marbyn.Repository.UserProfileRepository.UserProfileRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MarbynApplicationTest {

    MarbynApplicationTest(SysUserRepository sysUserRepository){
        this.sysUserRepository = sysUserRepository;
    }
    SysUserRepository sysUserRepository;


    UserProfileRepository userProfileRepository;

    SmartphoneRepository smartphoneRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void run() {
    }
}