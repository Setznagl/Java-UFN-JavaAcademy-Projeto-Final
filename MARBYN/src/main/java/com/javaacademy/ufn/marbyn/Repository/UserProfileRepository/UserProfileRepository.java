package com.javaacademy.ufn.marbyn.Repository.UserProfileRepository;

import com.javaacademy.ufn.marbyn.Model.SysUserModel.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    //Abstraction of the JPA Hibernate DAO and C.R.U.D functions
}
