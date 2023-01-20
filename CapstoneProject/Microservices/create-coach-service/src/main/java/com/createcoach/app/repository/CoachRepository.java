package com.createcoach.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createcoach.app.entity.Coach;

public interface CoachRepository extends JpaRepository<Coach, Integer> {

}
