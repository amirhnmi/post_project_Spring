package com.example.postprojectspring.module.users.controller;

import com.example.postprojectspring.module.users.entity.Users;
import com.example.postprojectspring.module.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsersController {
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService){
        this.usersService = usersService;
    }

    @RequestMapping(value = "/users/list", method = RequestMethod.GET)
    public List<Users> getUsers(){
        return usersService.findAllUsers();
    }

    @RequestMapping(value = "/users/create", method = RequestMethod.POST)
    public Users registerUsers(@RequestBody Users users){
        return usersService.registerUser(users);
    }


}
