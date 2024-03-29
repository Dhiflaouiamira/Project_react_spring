
package com.tekup.AgenceImmobilier.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.AgenceImmobilier.Service.RoleServices;
import com.tekup.AgenceImmobilier.model.Role;


@RestController
@RequestMapping({"/api/role"})

public class RoleController {
	
	@Autowired
	private RoleServices roleServices;
	
	
	@GetMapping("/findAll")
	public List<Role> getALLRole(){
		return roleServices.getAllRole();
}
	
	@PostMapping("/Add")
	public Role AddRole(@RequestBody Role R) {
		return roleServices.saveRole(R);
}

      
    @DeleteMapping("/delete")
    public void DeleteRole(@RequestBody Role R) {
    	roleServices.deleteRole(R);
    }
}