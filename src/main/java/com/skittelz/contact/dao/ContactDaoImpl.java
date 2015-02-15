package com.skittelz.contact.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.skittelz.contact.domain.Contact;

/**
 * Provides hibernate based persistant related services for contacts
 *
 */

@Repository("contactDao")
public class ContactDaoImpl implements ContactDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory = null;

	@Override
	public void createContact(Contact contact) {
		sessionFactory.getCurrentSession().save(contact);

	}

	@Override
	public void updateContact(Contact contact) {
		sessionFactory.getCurrentSession().update(contact);

	}

	@Override
	public void removeContact(Long id) {
		Contact contact = (Contact) sessionFactory.getCurrentSession().load(
				Contact.class, id);
		if (contact != null) {
			sessionFactory.getCurrentSession().delete(contact);
		}

	}

	@Override
	public List<Contact> getAllContacts() {
		return sessionFactory.getCurrentSession().getNamedQuery("CONTACTS.findAll").list();		
	}

	@Override
	public Contact getContactByName(String name) {
		Contact contact= (Contact) sessionFactory.getCurrentSession().getNamedQuery("CONTACTS.findByName").setString("name", name).uniqueResult();
		return contact;	
	}

	@Override
	public Contact getContactById(Long id) {
		Contact contact= (Contact) sessionFactory.getCurrentSession().getNamedQuery("CONTACTS.findById").setLong("id", id).uniqueResult();
		return contact;
	}

}
