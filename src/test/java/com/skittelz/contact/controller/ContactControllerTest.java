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
        //We have to reset our mock between tests because the mock objects
        //are managed by the Spring container. If we would not reset them,
        //stubbing and verified behavior would "leak" from one test to another.
    //    Mockito.reset(todoServiceMock);
 
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
			.andExpect(view().name("ab"))
			.andExpect(forwardedUrl("/WEB-INF/jsp/ab.jsp"));
	}
    
    @Test   
    public void findAllContacts() throws Exception {
        mockMvc.perform(get("/contact/viewall"))
                .andExpect(status().isOk())
                .andExpect(view().name("ab"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/ab.jsp"))
             //   .andExpect(model().attribute("contacts", hasSize(1)))
//                .andExpect(model().attribute("todos", hasItem(
//                        allOf(
//                                hasProperty("id", is(1L)),
//                                hasProperty("description", is("Lorem ipsum")),
//                                hasProperty("title", is("Foo"))
//                        )
//                )))
                .andExpect(model().attribute("contacts", hasItem(                       
                        allOf(
                                hasProperty("email", is("omair@gmail.com")),
                                hasProperty("name", is("omair"))                               
                        )
                )));
    }
    
    @Test    
    public void findContactByName() throws Exception {
        mockMvc.perform(get("/contact/view/name/{name}", "omair"))
                .andExpect(status().isOk())
                .andExpect(view().name("ab"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/ab.jsp"))
                .andExpect(model().attribute("contact", hasProperty("email", is("omair@gmail.com"))))
                .andExpect(model().attribute("contact", hasProperty("name", is("omair"))));               
    }
    
    @Ignore
    @Test    
    public void findContactById() throws Exception {
        mockMvc.perform(get("/contact/view/{id}", 1L))
                .andExpect(status().isOk())
                .andExpect(view().name("ab"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/ab.jsp"))
                .andExpect(model().attribute("contact", hasProperty("email", is("omair@gmail.com"))))
                .andExpect(model().attribute("contact", hasProperty("name", is("omair"))));               
    }
    
    @Ignore
    @Test   
    public void deleteContactById() throws Exception {
        mockMvc.perform(get("/contact/delete/{id}", 1L))
                .andExpect(status().isOk())
                .andExpect(view().name("ab"))
              //  .andExpect(flash().attribute("feedbackMessage", is("Todo entry: Foo was deleted.")))
                ;
    }
    
    @Test   
    public void showAddTodoForm() throws Exception {
        mockMvc.perform(get("/contact/newcontactform"))
                .andExpect(status().isOk())
                .andExpect(view().name("ab"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/ab.jsp"))
                .andExpect(model().attribute("contact", hasProperty("contactId", nullValue())))
                .andExpect(model().attribute("contact", hasProperty("name", nullValue())))
                .andExpect(model().attribute("contact", hasProperty("email", nullValue())));       
    }
    
    @Test    
    public void addTodoWhenTitleAndDescriptionAreTooLong() throws Exception {
        String name = "yasir";
        String email = "yasir@gamil.com";
 
        mockMvc.perform(post("/contact/add")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("name", name)
                .param("email", email)
                .requestAttr("contact", new Contact())
        )
                .andExpect(status().isOk())
                .andExpect(view().name("newcontactform"))
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
                .andExpect(view().name("ab"))
               // .andExpect(model().attribute("id", is("3")))
                ;
    }
    
    /*  
      @Test
    @ExpectedDatabase(value="toDoData-update-expected.xml", assertionMode = DatabaseAssertionMode.NON_STRICT)
    public void updateTodo() throws Exception {
        mockMvc.perform(post("/todo/update")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("description", "description")
                .param("id", "1")
                .param("title", "title")
                .sessionAttr("todo", new TodoDTO())
        )
                .andExpect(status().isOk())
                .andExpect(view().name("redirect:/todo/view/{id}"))
                .andExpect(model().attribute("id", is("1")))
                .andExpect(flash().attribute("feedbackMessage", is("Todo entry: title was updated.")));
    }
     
     */
     

}
