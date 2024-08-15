package com.javaacademy.ufn.marbyn.Model.SysUserModel;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
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

    @OneToMany(mappedBy = "mappedUser")
    @JoinColumn(name = "SysUser_id" , nullable = true , unique = false , updatable = true )
    private List<UserProfile> userProfiles;

    //////////////////////////////////////////////////////////////////////////////

    @Column( nullable = false , length = 30 )
    private String name;

    @Column( nullable = false , length = 50 )
    private String email;

    @Column( nullable = false , length = 20 )
    private String password;

}
