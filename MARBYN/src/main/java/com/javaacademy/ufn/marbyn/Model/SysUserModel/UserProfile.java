package com.javaacademy.ufn.marbyn.Model.SysUserModel;

import com.javaacademy.ufn.marbyn.Model.SmartphoneModel.Smartphone;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.jpa.repository.Query;

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
    @JoinColumn(name = "SysUser_id" , nullable = true , unique = false , updatable = false )
    private SysUser mappedUser;

    @ManyToOne
    //@JoinColumn(name = "recommendations" , nullable = true , unique = false , updatable = false )
    private Smartphone recommendation_devices;

    //////////////////////////////////////////////////////////////////////////////

}
