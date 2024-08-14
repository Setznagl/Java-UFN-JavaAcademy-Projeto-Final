package com.javaacademy.ufn.marbyn.Repository.SmartphoneRepository;

import com.javaacademy.ufn.marbyn.Model.SmartphoneModel.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone, Long> {
    //Abstraction of the JPA Hibernate DAO and C.R.U.D functions
}
