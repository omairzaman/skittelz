package com.skittelz.contact.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skittelz.contact.domain.Contact;
import com.skittelz.contact.service.ContactService;


@RequestMapping("/contact")
public class SampleContactController {

	@Resource(name="contactService")
	private ContactService contactService;
	
	@RequestMapping( method = RequestMethod.GET)
	 public ModelAndView index() {
		 return new ModelAndView("contact");	  
	 }
	
	@RequestMapping("newcontactform")
    public ModelAndView showCreateNewUserForm() {

        ModelAndView mv = new ModelAndView("contact");       
        mv.addObject("contact", new Contact());

        return mv;
    }
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView addContact(@Valid @ModelAttribute("contact") 
	Contact contact, BindingResult result) {
		
		 ModelAndView mv = null;
	        
	        if( result.hasErrors()){
	            mv = new ModelAndView("contact");
	            mv.addObject("contact", contact);
	        }else{
	           // mv = new ModelAndView("redirect:default.do");
	        	mv = new ModelAndView("contact");
	        	contactService.createContact(contact);
	        }
	        
	        

	        return mv;
	}

	@RequestMapping("/delete/{contactId}")
	public ModelAndView deleteContact(@PathVariable("contactId")
	Long contactId) {

		ModelAndView mv = new ModelAndView("contact");
		contactService.removeContact(contactId);

		return mv;
	}
	
	@RequestMapping("/view/{contactId}")
	public ModelAndView viewContact(@PathVariable("contactId")
	Long contactId) {

		ModelAndView mv = new ModelAndView("contact");
		mv.addObject("contact", contactService.getContactById(contactId));		
		return mv;
	}
	
	@RequestMapping("/view/name/{name}")
	public ModelAndView viewContact(@PathVariable("name")
	String name) {

		ModelAndView mv = new ModelAndView("contact");
		mv.addObject("contact", contactService.getContactByName(name));		
		return mv;
	}
	
	 @RequestMapping("/viewall")
	 public ModelAndView viewAllContacts() {

	        ModelAndView mv = new ModelAndView("contact");
	        mv.addObject("contacts", contactService.getAllContacts());
	        return mv;
	    } 
	 
	/* @RequestMapping(value = "/todo/update", method = RequestMethod.POST)
	    public String update(@Valid @ModelAttribute("todo") TodoDTO dto, BindingResult result, RedirectAttributes attributes) throws TodoNotFoundException {
	        if (result.hasErrors()) {
	            return "todo/update";
	        }
	 
	        Todo updated = service.update(dto);
	 
	        addFeedbackMessage(attributes, "feedback.message.todo.updated", updated.getTitle());
	        attributes.addAttribute("id", updated.getId());
	 
	        return createRedirectViewPath("/todo/{id}");
	    } */
	
}

