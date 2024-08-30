package com.javaacademy.ufn.marbyn.Model.SysUserModel;

import com.javaacademy.ufn.marbyn.Model.SmartphoneModel.Smartphone;
/* Prevents system.out Stack Overflow */
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringExclude;
//
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @JsonManagedReference
    /* Prevents system.out Stack Overflow */
    @ToStringExclude
    //
    @JoinColumn(name = "sysuser_id")
    private SysUser fk_user;


    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @JsonManagedReference
    @ToStringExclude
    @JoinColumn(name = "smartphone_id")
    private Smartphone fk_smartphone;


    /*Prevents system.out stack overflow*/
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
    // */

}
