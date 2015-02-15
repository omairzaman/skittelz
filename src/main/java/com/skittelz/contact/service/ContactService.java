package com.skittelz.contact.service;

import java.util.List;

import com.skittelz.contact.domain.Contact;

/**
 * Provides services to manage {@code Contact}.
 *
 */
public interface ContactService {

	/**
	 * Creates the contact.
	 * 
	 * @param contact
	 */
	public void createContact(Contact contact);

	/**
	 * Updates the contact.
	 * 
	 * @param contact
	 */
	public void updateContact(Contact contact);

	/**
	 * Removes the contact.
	 * 
	 * @param id
	 */
	public void removeContact(Long id);

	/**
	 * Get all contacts.
	 * 
	 * @return list of contacts
	 */
	public List<Contact> getAllContacts();

	/**
	 * Gets the contact by contact name.
	 * 
	 * @param contact
	 *            name
	 * @return
	 */
	public Contact getContactByName(String name);
	
	/**
	 * Gets the contact by id.
	 * 
	 * @param contact
	 *            id
	 * @return
	 */
	public Contact getContactById(Long id);
}
