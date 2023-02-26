package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import com.tekup.AgenceImmobilier.model.Role;

public interface RoleServices {
	Role saveRole(Role R);
	void deleteRole(Role R);
	Role getRole(Long id);
	List<Role> getAllRole();
}
