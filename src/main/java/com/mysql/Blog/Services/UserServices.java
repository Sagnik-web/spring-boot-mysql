package com.mysql.Blog.Services;

import com.mysql.Blog.DTO.UserDTO;
import com.mysql.Blog.Entity.User;
import com.mysql.Blog.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserServices {

    @Autowired
    private UserRepo userRepo;


    public void createUser(User user){
        userRepo.save(user);
    }

    public List<UserDTO> getAllUser(){
        return userRepo.findAll().stream().map(el->new UserDTO(el.getName(),el.getEmail())).collect(Collectors.toList());
    }
}
