package com.example.contactapp;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ContactController {

    private ContactRepository contactRepository;
}
