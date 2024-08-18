package com.javaacademy.ufn.marbyn.Model.SmartphoneModel;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.SysUser;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.UserProfile;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity
@AllArgsConstructor
public class Smartphone {

    public Smartphone(){
        //Empty constructor
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "userprofile_id")
    private UserProfile fk_profiles;

    //////////////////////////////////////////////////////////////////////////////

    @Column( updatable = false , nullable = false /*, unique = true*/ , length =  50)
    private String brand;

}
