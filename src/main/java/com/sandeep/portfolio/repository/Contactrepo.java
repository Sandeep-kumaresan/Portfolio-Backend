package com.sandeep.portfolio.repository;

import com.sandeep.portfolio.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Contactrepo extends JpaRepository<Contact,Long> {
}
