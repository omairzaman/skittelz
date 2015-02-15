package net.viralpatel.contact.service;

import java.util.List;

import javax.annotation.Resource;

import net.viralpatel.contact.dao.ContactDAO;
import net.viralpatel.contact.form.Contact;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("contactService1")
public class ContactServiceImpl implements ContactService {


	@Resource(name="contactDao1")
	private ContactDAO contactDAO;
	
	@Transactional
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}

	@Transactional
	public List<Contact> listContact() {

		return contactDAO.listContact();
	}

	@Transactional
	public void removeContact(Integer id) {
		contactDAO.removeContact(id);
	}
}
