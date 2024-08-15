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

    @Id
    @Column( updatable = false , nullable = false , unique = true , length = 5 )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "recommendation_devices")
    List<UserProfile> primary;

    //////////////////////////////////////////////////////////////////////////////

    @Column( updatable = false , nullable = false , unique = true , length =  10)
    private String brand;

}
