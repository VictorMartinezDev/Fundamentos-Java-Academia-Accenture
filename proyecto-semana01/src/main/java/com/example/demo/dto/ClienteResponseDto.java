package com.example.demo.dto;

import java.time.LocalDate;

public class ClienteResponseDto {
	
	String name;
	int age;
	String email;
	String numberPhone;
	LocalDate birthdate;
	
	
	public ClienteResponseDto(String name, int age, String email, String numberPhone, LocalDate birthdate) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.numberPhone = numberPhone;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	

}
