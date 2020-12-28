package com.get;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "p";
		String encodedPassowrd = encoder.encode(rawPassword);
		
		System.out.println("Sifra jee:" + encodedPassowrd);
	}
}
