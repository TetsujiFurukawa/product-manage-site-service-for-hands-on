package com.example.demo.entity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MenuSubMenuMst")
@Data
@NoArgsConstructor
public class MenuSubMenuMst {

	@Column(nullable = false)
	private String menuCode;

	@Id
	@Column(nullable = false)
	private String subMenuCode;

}
