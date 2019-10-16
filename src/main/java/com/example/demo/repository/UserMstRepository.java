package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.domain.UserMst;

public interface UserMstRepository extends JpaRepository<UserMst, Integer> {
	@Query(value = "SELECT" +
			"  USER_SEQ" +
			"  , USER_ACCOUNT" +
			"  , USER_ENCODED_PASSWORD" +
			"  , USER_NAME" +
			"  , USER_LANG" +
			"  , USER_TIMEZONE" +
			"  , USER_SUB_MENU_ROLE" +
			"  , DELETED" +
			"  , ENTER_DATE" +
			"  , ENTER_USER" +
			"  , UPDATE_DATE" +
			"  , UPDATE_USER " +
			"FROM" +
			"  USER_MST " +
			"WHERE user_account = :userAccount", nativeQuery = true)

	UserMst findUserMstByAccount(@Param("userAccount") String userAccount);

}
