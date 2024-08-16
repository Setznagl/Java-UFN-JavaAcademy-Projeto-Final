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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private SysUser fk_user;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Smartphone fk_smartphone;

    //////////////////////////////////////////////////////////////////////////////

}
