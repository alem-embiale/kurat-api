package com.kurat.kuratapi.controller;

import com.kurat.kuratapi.model.Admin;
import com.kurat.kuratapi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/id/{id}")
    public Admin getAdminById(@PathVariable Long id) {
        return adminService.getAdminById(id);
    }

    @GetMapping
    public List<Admin> getAllAdmins() {
//        return Collections.singletonList(new Admin("Alem", "Embiale", "email@email.com"));
        return adminService.getAllAdmins();
    }

}
