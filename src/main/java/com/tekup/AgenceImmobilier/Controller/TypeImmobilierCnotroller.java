
package com.tekup.AgenceImmobilier.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.AgenceImmobilier.Service.TypeImmobilierServices;
import com.tekup.AgenceImmobilier.model.TypeImmobilier;


@RestController
@RequestMapping({"/api/TypeImmobilier"})

 public class TypeImmobilierCnotroller {




	@Autowired
	private TypeImmobilierServices typeImmobilierServices;
	
	
	@GetMapping("/findAll")
	public List<TypeImmobilier> getALLTypeImmobilier(){
		return typeImmobilierServices.getAllTypeImmobilier();
}
	
	@PostMapping("/Add")
	public TypeImmobilier AddTypeImmobilier(@RequestBody TypeImmobilier T) {
		return typeImmobilierServices.saveTypeImmobilier(T);
}

      
    @DeleteMapping("/delete")
    public void DeleteTypeImmobilier(@RequestBody TypeImmobilier T) {
    	typeImmobilierServices.deleteTypeImmobilier(T);
    }
}