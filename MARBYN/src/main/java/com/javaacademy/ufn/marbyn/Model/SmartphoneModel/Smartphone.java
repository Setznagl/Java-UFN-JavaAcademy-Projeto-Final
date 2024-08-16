package com.javaacademy.ufn.marbyn.Model.SmartphoneModel;

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
    @Column( updatable = false , nullable = false , unique = true , length = 5 )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(mappedBy = "fk_smartphone", optional = false)
    private UserProfile fk_smartphone;

    //////////////////////////////////////////////////////////////////////////////

    @Column( updatable = false , nullable = false , unique = true , length =  50)
    private String brand;

}
