package com.createuser.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createuser.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
