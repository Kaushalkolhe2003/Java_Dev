package com.security.test.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Homecontrollers {
	
	@PreAuthorize("hasRole('NORMAL')")
	@GetMapping("/normal")
	public ResponseEntity<String> norrmaluser(){
		return ResponseEntity.ok("yes i am normal");
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public ResponseEntity<String> adminuser(){
		return ResponseEntity.ok("yes i am admin");
	}
	
	@GetMapping("/public")
	public ResponseEntity<String> publicuser(){
		return ResponseEntity.ok("yes i am publicuser");
	}
	
	
	
}
