package com.javaacademy.ufn.marbyn.Model.SmartphoneModel;

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
public class Smartphone {

    public Smartphone(){
        //Empty constructor
    }

    @Id
    @Column( updatable = false , nullable = false , unique = true , length = 5 )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( updatable = false , nullable = false , unique = true , length =  10)
    private String brand;

}
