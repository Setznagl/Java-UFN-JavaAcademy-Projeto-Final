package com.javaacademy.ufn.marbyn.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    @Column( updatable = true , nullable = false , unique = false , length = 30 )
    private String name;

    @Column( updatable = true , nullable = false , unique = false , length = 50 )
    private String email;

    @Column( updatable = true , nullable = false , unique = false , length = 20 )
    private String password;
}
