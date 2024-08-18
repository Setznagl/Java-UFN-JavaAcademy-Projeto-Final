package com.javaacademy.ufn.marbyn.Model.SysUserModel;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.javaacademy.ufn.marbyn.Model.SmartphoneModel.Smartphone;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
public class UserProfile {
    public UserProfile() {
        //Empty constructor
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "sysuser_id")
    private SysUser fk_user;

    @JsonManagedReference
    @OneToMany(mappedBy = "fk_profiles" , fetch = FetchType.EAGER)
    public List<Smartphone> userSmartphones;

}
