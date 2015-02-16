package com.skittelz.contact.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skittelz.contact.domain.Contact;
import com.skittelz.contact.service.ContactService;

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring-servlet.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ContactServiceTest {
	
	@Resource(name="contactService")
	ContactService contactService;
	
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory = null;
	
	@Test
	public void checkWiring(){
		assertNotNull(contactService);
	}
	
	@Test
	public void testServices(){
		Session session=sessionFactory.openSession();
		session.createSQLQuery("delete from contacts").executeUpdate()	;
		session.close();
	
		Contact contact=new Contact();
		contact.setName("omair");
		contact.setEmail("omair@gmail.com");
		contact.setMessage("yes dear");
		
		contactService.createContact(contact);
		
		Long id=contact.getContactId();
		assertEquals("Search Id should be the same",id,contactService.getContactById(id).getContactId());
		
		Contact contactSearch=contactService.getContactByName("omair");
		assertEquals("Search Name should be the same","omair",contactSearch.getName());
		
		List<Contact> contacts=contactService.getAllContacts();
		assertEquals("list size should be one",1,contacts.size());
		
		assertTrue("list size should be greator than zero", contacts.size()>0); 
		
	}

}
