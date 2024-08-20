package com.javaacademy.ufn.marbyn.Model.SysUserModel;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

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
    private Long id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "sysuser_id")
    private SysUser fk_user;

    @Column(name = "fk_smartphone_id")
    private Long fk_smartphone_id;

}
