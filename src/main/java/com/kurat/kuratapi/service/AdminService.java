package com.kurat.kuratapi.service;

import com.kurat.kuratapi.model.Admin;
import com.kurat.kuratapi.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }
    public List<Admin> getAllAdmins() {return adminRepository.findAll(); }
}
