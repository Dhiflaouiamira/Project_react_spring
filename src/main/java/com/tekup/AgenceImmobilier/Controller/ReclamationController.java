package com.tekup.AgenceImmobilier.Controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.AgenceImmobilier.Service.ReclamationServices;
import com.tekup.AgenceImmobilier.model.Reclamation;


@RestController
@RequestMapping({"/api/reclamation"})

public class ReclamationController {
	@Autowired
	private ReclamationServices reclamationServices;
	
	
	@GetMapping("/findAll")
	public List<Reclamation> getALLReclamation(){
		return reclamationServices.getAllReclamation();
}
	
	@PostMapping("/Add")
	public Reclamation AddReclamation(@RequestBody Reclamation R) {
		return reclamationServices.saveReclamation(R);
}

      
    @DeleteMapping("/delete")
    public void DeleteReclamation(@RequestBody Reclamation R) {
    	reclamationServices.deleteReclamation(R);
    }
}