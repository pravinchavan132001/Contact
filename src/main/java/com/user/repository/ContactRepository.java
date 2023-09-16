package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.Contact;


public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	
}
