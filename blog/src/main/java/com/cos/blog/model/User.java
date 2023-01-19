package com.cos.blog.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
//ORM -> Java(다른언어) Object -> 테이블이 매핑해주는 기술
@Entity // User 클래스가 MySQL에 테이블이 생성된다.
//@DynamicInsert //insert시에  null인 필드를 제외시켜 준다.
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length=30, unique = true)
	private String username;
	
	@Column(nullable = false, length=100)
	private String password;
	
	@Column(nullable = false, length=50)
	private String email;
	
	@Enumerated(EnumType.STRING)
	private RoleType role; //Enum을 사용하는 것이 유익함 //ADMIN, USER로 제한
	//private String role;
	
	
	@CreationTimestamp
	private Timestamp createDate;

}
