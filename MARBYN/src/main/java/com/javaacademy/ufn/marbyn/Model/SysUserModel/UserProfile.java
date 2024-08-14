package com.javaacademy.ufn.marbyn.Model.SysUserModel;

import com.javaacademy.ufn.marbyn.Model.SmartphoneModel.Smartphone;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@AllArgsConstructor
public class UserProfile {
    public UserProfile() {
        //Empty constructor
    }

    @ManyToOne
    @JoinColumn(name = "SysUser_id" , nullable = true , unique = false , updatable = false )
    private SysUser mappedUser;

    @ManyToOne
    @JoinColumn(name = "recommendation_pri" , nullable = true)
    @Column( nullable = false , unique = false , updatable = false )
    private Smartphone recommendation_pri;

    @ManyToOne
    @JoinColumn(name = "recommendation_sec" , nullable = true)
    @Column( nullable = false , updatable = false )
    private Smartphone recommendation_sec;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


}
