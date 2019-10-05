package com.example.demo.entity.domain;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "user_mst")
@Data
@RequiredArgsConstructor
public class UserMstDto {
	@Id
	@GeneratedValue
	@Column(nullable = false)
	private Integer user_seq;

	@Column(nullable = false)
	private String userAccount;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private String userLang;

	@Column(nullable = false)
	private String userTimezone;

	@Column(nullable = false)
	private Boolean deleted;

	@Column(nullable = false)
	private Timestamp enterDate;

	@Column(nullable = false)
	private String enterUser;

	@Column(nullable = false)
	private Timestamp updateDate;

	@Column(nullable = false)
	private String updateUser;

}
