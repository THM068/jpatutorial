package com.oreilly.sdata.services;

import com.oreilly.sdata.domains.Role;
import com.oreilly.sdata.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tm1c14 on 03/08/2016.
 */
@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public void save(Role role) {
        this.roleRepository.save(role);
    }

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Role findByAuthority(String authority){
        return roleRepository.findByAuthority(authority);
    }
}
