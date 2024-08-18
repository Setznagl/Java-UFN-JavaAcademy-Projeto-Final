package com.javaacademy.ufn.marbyn.Controller.UserProfileController;

import com.javaacademy.ufn.marbyn.Model.SysUserModel.UserProfile;
import com.javaacademy.ufn.marbyn.Repository.SysUserRepository.SysUserRepository;
import com.javaacademy.ufn.marbyn.Repository.UserProfileRepository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/get")
public class ProfileRequests {

    @Autowired
    SysUserRepository sysUserRepository;

    @Autowired
    UserProfileRepository userProfileRepository;

    @GetMapping("/profile/all")
    CollectionModel<EntityModel<UserProfile>> getAllProfiles() {
        List<EntityModel<UserProfile>> profileList = userProfileRepository.findAll().stream()
                .map(userProfile -> EntityModel.of(userProfile,
                        linkTo(methodOn(ProfileRequests.class).getOneProfile(Long.valueOf(userProfile.getId()))).withSelfRel(),
                        linkTo(methodOn(ProfileRequests.class).getAllProfiles()).withRel("profileList")))
                .collect(Collectors.toList());
        return CollectionModel.of(profileList, linkTo(methodOn(ProfileRequests.class).getAllProfiles()).withSelfRel());}


    @GetMapping("/profile/{id}")
    public UserProfile getOneProfile(@PathVariable Long id){
        Optional<UserProfile> convert = userProfileRepository.findById(id);
        return convert.orElse(null);
    }

}
