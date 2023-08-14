package com.kurat.kuratapi.service;

import com.kurat.kuratapi.model.Admins;
import com.kurat.kuratapi.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admins getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }
    public List<Admins> getAllAdmins() {return adminRepository.findAll(); }
}
