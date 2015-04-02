package com.skittelz.contact.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.skittelz.contact.dao.ContactDao;
import com.skittelz.contact.domain.Contact;
import com.skittelz.contact.service.ContactService;
import com.skittelz.contact.service.ContactServiceImpl;

@Ignore
public class ContactServiceByMockTest {

	private static ContactDao contactDao;
	private static Contact contact1=new Contact(1L,"syed","omair@gami.com","hi dear");
	private static Contact contact2=new Contact(2L,"arslan","arslan@gami.com","hi me arslan");	
	
	private static ContactService contactService;

	@BeforeClass
	public static void setUp() {
		contactDao = mock(ContactDao.class);
		when(contactDao.getAllContacts()).thenReturn( Arrays.asList(contact1,contact2) );
		when(contactDao.getContactById(1L)).thenReturn(contact1);
		when(contactDao.getContactByName("arslan")).thenReturn(contact2);
		contactService=new ContactServiceImpl(contactDao);		
	}
	
	@Test
	public void testContactServiceByMock(){
	 
		List<Contact> contacts=contactService.getAllContacts();
		assertEquals("List size should be 2",2,contacts.size());
		
		Contact contact=contacts.get(0);
		assertEquals("Contact Id should be 1",Long.valueOf(1),contact.getContactId());
		
		Contact contactByName= contactService.getContactByName("arslan");
		assertEquals("User name should be equal","arslan",contactByName.getName());
		
	}

}
