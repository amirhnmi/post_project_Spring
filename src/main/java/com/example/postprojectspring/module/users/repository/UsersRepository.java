package com.example.postprojectspring.module.users.repository;

import com.example.postprojectspring.module.users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {

    Users findByEmail(String email);
}
