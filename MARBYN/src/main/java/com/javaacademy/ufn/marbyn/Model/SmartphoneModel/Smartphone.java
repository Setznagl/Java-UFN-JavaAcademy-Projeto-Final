package com.javaacademy.ufn.marbyn.Model.SmartphoneModel;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity
@AllArgsConstructor
public class Smartphone {

    public Smartphone() {
        //Empty constructor
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //////////////////////////////////////////////////////////////////////////////

    @Column(updatable = false, nullable = false, unique = true, length = 50)
    private String brand;

}
