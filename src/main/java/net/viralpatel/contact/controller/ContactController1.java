package net.viralpatel.contact.controller;

import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import net.viralpatel.contact.form.Contact;
import net.viralpatel.contact.service.ContactService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController1 {


	@Resource(name="contactService1")
	private ContactService contactService;
	
	@RequestMapping(value="/abc")
	 public String index() {
	  return "index";
	 }

	@RequestMapping("/index1")
	public String listContacts(Map<String, Object> map) {

		map.put("contact", new Contact());
		map.put("contactList", contactService.listContact());

		return "contact";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
	Contact contact, BindingResult result) {

		contactService.addContact(contact);

		return "redirect:/index1";
	}

	@RequestMapping("/delete/{contactId}")
	public ModelAndView deleteContact(@PathVariable("contactId")
	Integer contactId) {

		ModelAndView mv = new ModelAndView("/ab");
		contactService.removeContact(contactId);

		return mv;
	}
	
	 @RequestMapping("/viewall")
	 public ModelAndView userListHander() {

	        ModelAndView mv = new ModelAndView("/ab");
	        mv.addObject("contacts", contactService.listContact());
	        return mv;
	    } 
}
