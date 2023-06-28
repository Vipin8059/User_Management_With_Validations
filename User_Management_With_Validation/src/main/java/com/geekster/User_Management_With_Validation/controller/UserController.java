package com.geekster.User_Management_With_Validation.controller;

import com.geekster.User_Management_With_Validation.model.User;
import com.geekster.User_Management_With_Validation.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    //get all the users
    @GetMapping("users")
    public List<User> getAllUsers(){
         return userService.getAllUsers();
    }

    // get user by id
    @GetMapping("users/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }


    // add list of users
    @PostMapping("users")
    public String addUsers(@RequestBody @Valid List<User> users){
        return userService.addUsers(users);
    }

    // update user info
    @PutMapping("users")
    public String updateUser(@RequestParam @NotNull Integer id, @RequestParam @NotBlank String userName){
        return userService.updateUser(id,userName);
    }

    // delete user by id
    @DeleteMapping("users/{id}")
    public String deleteUserById(@PathVariable Integer id){
        return userService.deleteUserById(id);
    }

}
