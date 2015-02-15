package com.skittelz.contact.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skittelz.contact.dao.ContactDao;
import com.skittelz.contact.domain.Contact;

/**
 * Provides an implementation to manage contacts.
 *
 */

@Service("contactService")
public class ContactServiceImpl implements ContactService {
	
	@Resource(name="contactDao")
	private ContactDao contactDao;

	public ContactServiceImpl(){}
	public ContactServiceImpl(ContactDao contactDao){ this.contactDao=contactDao; }
	
	@Override
	@Transactional
	public void createContact(Contact contact) {
		contactDao.createContact(contact);

	}

	@Override
	@Transactional
	public void updateContact(Contact contact) {
		contactDao.updateContact(contact);

	}

	@Override
	@Transactional
	public void removeContact(Long id) {
		contactDao.removeContact(id);

	}

	@Override
	@Transactional
	public List<Contact> getAllContacts() {
		return contactDao.getAllContacts();
	}

	@Override
	@Transactional
	public Contact getContactByName(String name) {
		return contactDao.getContactByName(name);
	}

	@Override
	@Transactional
	public Contact getContactById(Long id) {
		return contactDao.getContactById(id);
	}

	public ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

}
