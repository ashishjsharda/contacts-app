package com.example.contactapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Contact {
    @Id
    private String email;
    private String name;
    private String phone;

    private String password;
    private String roles;
    private boolean active;
}
