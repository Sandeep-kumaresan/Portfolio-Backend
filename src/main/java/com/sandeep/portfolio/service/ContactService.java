package com.sandeep.portfolio.service;

import com.sandeep.portfolio.dto.ContactDTO;
import com.sandeep.portfolio.entity.Contact;
import com.sandeep.portfolio.repository.Contactrepo;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private Contactrepo contactrepo;
    public ContactService(Contactrepo contactrepo) {
        this.contactrepo = contactrepo;
    }

    public String addContact(ContactDTO contactDTO) {
        Contact contact = new Contact();
        contact.setName(contactDTO.getName());
        contact.setEmail(contactDTO.getEmail());
        contact.setMessage(contactDTO.getMessage());
        contactrepo.save(contact);
        return "Contact Added Successfully";
    }
}
