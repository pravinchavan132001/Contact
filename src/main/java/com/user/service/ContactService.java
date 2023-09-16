package com.user.service;

import java.util.List;

import com.user.entity.Contact;

public interface ContactService {

	String upsert(Contact contact );
	List<Contact> getAllcontact();
	Contact getContact(int id);
	String deleteContact(int id);
}
