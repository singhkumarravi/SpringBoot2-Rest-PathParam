package com.olive.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
public class ProductController {
	
	// http://localhost:9898/prod/msg/Book
	
	@GetMapping("/msg/{code}")
	public ResponseEntity<String> showMsg(@PathVariable String code){
		     String msg="Welcome To Producer App Code" + code;
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/msg/test")
	public ResponseEntity<String> showMsgB(){
		     String msg="Welcome To Producer App Code :: ";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	
}
