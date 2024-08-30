package com.javaacademy.ufn.marbyn.Model.SysUserModel;

//import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
//import org.apache.commons.lang3.builder.ToStringExclude;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    /* Prevents Stack Overflow
    @ToStringExclude */
    @JoinColumn(name = "sysuser_id")
    private SysUser fk_user;

    @Column(name = "fk_smartphone_id")
    private Long fk_smartphone_id;

    /*Prevents stack overflow
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
    */

}
