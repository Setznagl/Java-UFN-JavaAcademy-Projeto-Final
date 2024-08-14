package com.javaacademy.ufn.marbyn.Model.SmartphoneModel;

import com.javaacademy.ufn.marbyn.Model.SysUserModel.UserProfile;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
public class Smartphone {

    public Smartphone(){
        //Empty constructor
    }

    @OneToMany(mappedBy = "recommendation_pri")
    List<UserProfile> primary;

    @OneToMany(mappedBy = "recommendation_sec")
    List<UserProfile> secondary;

    @Id
    @Column( updatable = false , nullable = false , unique = true , length = 5 )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( updatable = false , nullable = false , unique = true , length =  10)
    private String brand;

}
