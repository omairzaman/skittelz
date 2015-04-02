package com.skittelz.contact.controller;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.skittelz.contact.domain.Contact;
import com.skittelz.contact.service.ContactService;

@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring-servlet.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ContactControllerTest {
	
	private MockMvc mockMvc;
	 
    @Autowired
    private ContactService contactService;
 
    @Autowired
    private WebApplicationContext webApplicationContext;
 
    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void testWiring(){
    	assertNotNull("mock mvc not working", mockMvc);
    	assertNotNull("contact service not working", contactService);    	   	
    }
    
    @Test
	public void testContactMainPage() throws Exception {		
		 mockMvc.perform(get("/contact"))
         .andExpect(status().isOk())
         .andExpect(view().name("contact"))
         .andExpect(forwardedUrl("/WEB-INF/jsp/contact.jsp"))
         .andExpect(model().attribute("contact", hasProperty("contactId", nullValue())))
         .andExpect(model().attribute("contact", hasProperty("name", nullValue())))
         .andExpect(model().attribute("contact", hasProperty("email", nullValue())))
		 .andExpect(model().attribute("contact", hasProperty("message", nullValue()))); 
	}
    
    
    
   
    
    @Test    
    public void addContactWithErrors() throws Exception {
        String name = "yasir";
        String email = "yasir@gamil.com";
 
        mockMvc.perform(post("/contact/add")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("name", name)
                .param("email", email)
                .requestAttr("contact", new Contact())
        )
                .andExpect(status().isOk())
                .andExpect(view().name("contact"))
              //  .andExpect(forwardedUrl("/WEB-INF/jsp/ab.jsp"))                
                .andExpect(model().attributeHasFieldErrors("contact", "message"))
                .andExpect(model().attribute("contact", hasProperty("contactId", nullValue())))
                .andExpect(model().attribute("contact", hasProperty("name", is(name))))
                .andExpect(model().attribute("contact", hasProperty("email", is(email))));
    }
    
    @Test   
    public void addContact() throws Exception {
    	
        
        mockMvc.perform(post("/contact/add")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("name", "yasir")
                .param("email", "yasir@gmai.com")
                .param("message", "hisd how")
                .requestAttr("contact", new Contact())
        )
                .andExpect(status().isOk())
                .andExpect(view().name("contact"))
               // .andExpect(model().attribute("id", is("3")))
                ;
    }
    
    
     

}
