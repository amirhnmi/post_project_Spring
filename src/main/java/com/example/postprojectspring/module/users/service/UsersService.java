package com.example.postprojectspring.module.users.service;

import com.example.postprojectspring.module.users.entity.Users;
import com.example.postprojectspring.module.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public List<Users> findAllUsers(){
        return this.usersRepository.findAll();
    }

    public Users registerUser(Users users){
        return this.usersRepository.save(users);
    }

}
