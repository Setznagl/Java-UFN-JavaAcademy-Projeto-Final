package com.javaacademy.ufn.marbyn.Controller.SmartphoneController;

import com.javaacademy.ufn.marbyn.Model.SmartphoneModel.Smartphone;
import com.javaacademy.ufn.marbyn.Model.SysUserModel.UserProfile;
import com.javaacademy.ufn.marbyn.Repository.SmartphoneRepository.SmartphoneRepository;
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
public class SmartphoneRequests {

    @Autowired
    SmartphoneRepository smartphoneRepository;

    @GetMapping("/smartphone/all")
    CollectionModel<EntityModel<Smartphone>> getAllSmartphones() {
        List<EntityModel<Smartphone>> smartphoneList = smartphoneRepository.findAll().stream()
                .map(smartphone -> EntityModel.of(smartphone,
                        linkTo(methodOn(SmartphoneRequests.class).getOneProfile(Long.valueOf(smartphone.getId()))).withSelfRel(),
                        linkTo(methodOn(SmartphoneRequests.class).getAllSmartphones()).withRel("smartphoneList")))
                .collect(Collectors.toList());
        return CollectionModel.of(smartphoneList, linkTo(methodOn(SmartphoneRequests.class).getAllSmartphones()).withSelfRel());}


    @GetMapping("/smartphone/{id}")
    public Smartphone getOneProfile(@PathVariable Long id){
        Optional<Smartphone> convert = smartphoneRepository.findById(id);
        return convert.orElse(null);
    }

}
