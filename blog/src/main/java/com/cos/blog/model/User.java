package com.cos.blog.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// @Entity //테이블을 만들겠다
public class User {
	
	@Id // primary key를 쓰겠다
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 30, unique = true)
	// nullable = false -> not null
	// unique = true -> 중복을 허용하지 않겠다.
	private String username;
	
	@Column(nullable = false, length = 100)
	// 암호를 해쉬 태그로 바꾸기 위해 100으로 지정
	private String password;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	//사용자 or 관리자 여부
	private String role;
	private Timestamp createDate;
}