package com.example.tigerjinda.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DummyDto {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String password;

}
