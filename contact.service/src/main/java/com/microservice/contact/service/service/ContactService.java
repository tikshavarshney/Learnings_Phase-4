package com.microservice.contact.service.service;

import com.microservice.contact.service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
