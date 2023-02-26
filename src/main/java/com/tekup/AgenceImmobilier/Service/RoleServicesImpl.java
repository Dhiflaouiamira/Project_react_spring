package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tekup.AgenceImmobilier.model.Role;
import com.tekup.AgenceImmobilier.repos.RoleRepository;


public class RoleServicesImpl implements RoleServices {

	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@Override
	public Role saveRole(Role R) {
		return roleRepository.save(R);
	}

	@Override
	public void deleteRole(Role R) {
		roleRepository.delete(R);
		
	}

	@Override
	public Role getRole(Long id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public List<Role> getAllRole() {
		return roleRepository.findAll();
	}

}
