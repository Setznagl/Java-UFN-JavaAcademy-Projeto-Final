package com.javaacademy.ufn.marbyn.Model.SysUserModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
public class SysUser {

    public SysUser() {
        //Empty constructor
    }

    @Id
    @Column( updatable = false , nullable = false , unique = true , length = 5 )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( nullable = false , length = 30 )
    private String name;

    @Column( nullable = false , length = 50 )
    private String email;

    @Column( nullable = false , length = 20 )
    private String password;

}
