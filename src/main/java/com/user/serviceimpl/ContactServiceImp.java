package com.user.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Contact;
import com.user.repository.ContactRepository;
import com.user.service.ContactService;

@Service
public class ContactServiceImp implements ContactService {

	@Autowired
	 private ContactRepository repo;
	
	@Override
	public String upsert(Contact contact) {
		repo.save(contact);
		return "SUCCESS";
	}

	@Override
	public List<Contact> getAllcontact() {
		return repo.findAll();
	}

	@Override
	public Contact getContact(int id) {
	Optional<Contact> contactOpt=repo.findById(id);
	Contact contact=contactOpt.get();
		return contact;
	}

	@Override
	public String deleteContact(int id) {
	repo.deleteById(id);
		return null;
	}

}
