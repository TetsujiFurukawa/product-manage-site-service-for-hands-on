package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.domain.UserMst;

public interface UserMstRepository extends JpaRepository<UserMst, Integer> {
	@Query(value = "SELECT * FROM user_mst WHERE user_account = :userAccount", nativeQuery = true)

	UserMst findUserMstByAccount(@Param("userAccount") String userAccount);

}
