package com.mansour.twitter.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name ="roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="role_id")
	private Integer roleId;
	private String authority;
}
