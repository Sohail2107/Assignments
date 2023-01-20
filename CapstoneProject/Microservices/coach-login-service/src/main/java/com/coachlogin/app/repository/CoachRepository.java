package com.coachlogin.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coachlogin.app.entity.Coach;

public interface CoachRepository extends JpaRepository<Coach, Integer> {

}
