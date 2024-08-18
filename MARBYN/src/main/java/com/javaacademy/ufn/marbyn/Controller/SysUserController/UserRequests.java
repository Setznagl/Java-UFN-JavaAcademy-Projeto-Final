package com.javaacademy.ufn.marbyn.Controller.SysUserController;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.SysUser;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.UserProfile;
import com.javaacademy.ufn.marbyn.Repository.SysUserRepository.SysUserRepository;
import com.javaacademy.ufn.marbyn.Repository.UserProfileRepository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/get")
public class UserRequests {

    @Autowired
    SysUserRepository sysUserRepository;

    @Autowired
    UserProfileRepository userProfileRepository;

    @GetMapping("/user/all")
    CollectionModel<EntityModel<SysUser>> getAllUsers() {
        List<EntityModel<SysUser>> userList = sysUserRepository.findAll().stream()
                .map(sysUser -> EntityModel.of(sysUser,
                        linkTo(methodOn(UserRequests.class).getOneUser(Long.valueOf(sysUser.getId()))).withSelfRel(),
                        linkTo(methodOn(UserRequests.class).getAllUsers()).withRel("userList")))
                .collect(Collectors.toList());
        return CollectionModel.of(userList, linkTo(methodOn(UserRequests.class).getAllUsers()).withSelfRel());}


    @GetMapping("/{id}")
    public SysUser getOneUser(@PathVariable Long id){
        Optional<SysUser> convert = sysUserRepository.findById(id);
        return convert.orElse(null);
    }

//    @GetMapping("/{id}/profiles/{profileid}")
//    public List<UserProfile> getProfiles(@PathVariable Long id, @PathVariable Long profileid){
//        List
//    }
}
