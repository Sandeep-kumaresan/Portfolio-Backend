package com.sandeep.portfolio.controller;

import com.sandeep.portfolio.dto.ContactDTO;
import com.sandeep.portfolio.service.ContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    private ContactService contactService;
    public ContactController(ContactService contactService){
        this.contactService = contactService;
    }
    @GetMapping("/contact")
    public String addContact(ContactDTO contactDTO){
        return contactService.addContact(contactDTO);
    }
}
