package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.Contact;
import com.user.serviceimpl.ContactServiceImp;

@RestController
public class ContactrestController {

	@Autowired
	private ContactServiceImp service;

	@PostMapping("/contact")
	public	ResponseEntity<String> contact(@RequestBody Contact contact){
		String success=service.upsert(contact);
		return new ResponseEntity<>(success,HttpStatus.CREATED);
	}
	
	@GetMapping("/contactlist")
	 public ResponseEntity<List<Contact>> getAllcontact(){
		List <Contact> contact=service.getAllcontact();
		return new ResponseEntity<>(contact,HttpStatus.OK);
	}
	@GetMapping("/contact/{id}")
	public ResponseEntity getcontact(@PathVariable int id){
		Contact contact=service.getContact(id);
		return new ResponseEntity<>(contact,HttpStatus.OK);
	}
	
	@DeleteMapping("/contact/{id}")
	public ResponseEntity deletecontact(@PathVariable int id){
		String msg=service.deleteContact(id);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
