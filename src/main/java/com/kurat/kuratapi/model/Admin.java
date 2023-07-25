package com.kurat.kuratapi.model;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    public Admin() {

    }

    public Admin(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return id == admin.id && Objects.equals(firstName, admin.firstName) && Objects.equals(lastName, admin.lastName) && Objects.equals(email, admin.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }
}
