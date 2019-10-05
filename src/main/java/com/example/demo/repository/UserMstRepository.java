package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.domain.UserMstDto;

public interface UserMstRepository extends JpaRepository<UserMstDto, Integer> {

}
