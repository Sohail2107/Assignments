package com.userlogin.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userlogin.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
