package com.mysql.Blog.Controller;

import com.mysql.Blog.DTO.UserDTO;
import com.mysql.Blog.Entity.User;
import com.mysql.Blog.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping
    public boolean createUserDetails(@RequestBody User user){
        userServices.createUser(user);
        return true;
    }

    @GetMapping
    public List<UserDTO> getAllUserDetails(){
       return userServices.getAllUser();

    }
}
