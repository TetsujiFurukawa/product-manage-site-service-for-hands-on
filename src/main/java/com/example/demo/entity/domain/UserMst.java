package com.example.demo.entity.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_mst")
@Data
@NoArgsConstructor
public class UserMst {
	@Id
	@GeneratedValue
//	@Column(nullable = false)
	private Integer user_seq;

//	@Column(nullable = false)
	private String userEncodedPassword;

//	@Column(nullable = false)
	private String userAccount;

//	@Column(nullable = false)
	private String userName;

//	@Column(nullable = false)
	private String userLang;

//	@Column(nullable = false)
	private String userTimezone;

//	@Column(nullable = false)
	private String deleted;

//	@Column(nullable = false)
	private String enterDate;

//	@Column(nullable = false)
	private String enterUser;

//	@Column(nullable = false)
	private String updateDate;

//	@Column(nullable = false)
	private String updateUser;

}
