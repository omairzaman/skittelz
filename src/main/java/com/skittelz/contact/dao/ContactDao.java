package com.skittelz.contact.dao;

import java.util.List;

import com.skittelz.contact.domain.Contact;

/**
 * 
 * Provide persistence related functionality for contacts
 *
 */
public interface ContactDao {

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
	 * Gets the contact by name.
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
