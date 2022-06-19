package com.cibertec.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class DecoderPassword {

	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		String password = "elba2022";
		String encodedPassword = "$2a$10$c9RD9RXBHmdsN9WcjAel/uuFIRjJ7CbV67Us01PYjn86Zl9QDEHeS";
		
		boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
		System.out.println("Password : " + password + "   isPasswordMatch    : " + isPasswordMatch);
		
	}
}
