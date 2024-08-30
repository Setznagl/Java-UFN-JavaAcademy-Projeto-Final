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

    @Column(updatable = false, nullable = false, unique = true, length = 20)
    private String brand;

    @Column(updatable = false, nullable = false, unique = true, length = 20)
    private String model;

    @Column(updatable = false, nullable = false, length = 50)
    private String CommercialName;

    @Column(updatable = false, nullable = false, length = 15)
    private String Operating_System;

    @Column(updatable = false, nullable = false, length = 3)
    private Integer Operating_System_Support_Years;

    @Column(updatable = false, nullable = false, length = 3)
    private Integer RAM_GB;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Is_The_Ram_Expansible;

    @Column(updatable = false, length = 3)
    private Integer  RAM_With_Expansible;

    @Column(updatable = false, nullable = false, length = 5)
    private Integer Storage_GB;

    @Column(updatable = false , nullable = false , length = 5)
    private Integer Camera_Primary_Megapixels;

    @Column(updatable = false , nullable = false , length = 5)
    private Integer Camera_Wide_Megapixels;

    @Column(updatable = false , nullable = false , length = 5)
    private Integer Camera_Macro_Megapixels;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Camera_Have_Digital_Zoom;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Camera_Have_Optical_Zoom;

    @Column(updatable = false, nullable = false, length = 3)
    private Long Screen_Size_Inches;

    @Column(updatable = false, nullable = false, length = 15)
    private String Screen_Type;

    @Column(updatable = false , nullable = false , length = 5)
    private Integer Screen_FPS_Hz;

    @Column(updatable = false, nullable = false, length = 7)
    private String Screen_Bright_Nits;

    @Column(updatable = false , nullable = false , length = 5)
    private Integer Battery_Size_mAh;

    @Column(nullable = false, length = 8)
    private String Battery_Autonomy_Hours;

    @Column(updatable = false , nullable = false , length = 5)
    private Integer Battery_Full_Charge_Hours;

    @Column(updatable = false , nullable = false , length = 5)
    private Integer Battery_Charging_Potency_Watts;

    @Column(updatable = false, nullable = false, length = 50)
    private String Processor_Model;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Processor_Simple_Use;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Processor_Common_Use;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Processor_Gaming_Use;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Processor_High_End_Use;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Durability_Panda_Glass;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Durability_Gorilla_Glass_3;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Durability_Gorilla_Glass_5;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Durability_Gorilla_Glass_Victus;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Durability_Splash_Resistance;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean Durability_Water_Resistance;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean AdditionalResource_NFC;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean AdditionalResource_Expansible_Storage;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean AdditionalResource_Wireless_Charge;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean AdditionalResource_Reverse_Wireless_Charge;

    @Column(updatable = false, nullable = false, length = 1)
    private Boolean AdditionalResource_Fingerprint_Sensor;

    @Column(nullable = false, length = 10)
    private Long  Price_Lowest;

    @Column(nullable = false, length = 10)
    private Long Price_Highest;
}
