package com.tekup.AgenceImmobilier.Controller;





import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.AgenceImmobilier.Service.StatusServices;
import com.tekup.AgenceImmobilier.model.Status;


@RestController
@RequestMapping({"/api/status"})

public class StatusController {


	@Autowired
	private StatusServices statusServices;
	
	
	@GetMapping("/findAll")
	public List<Status> getALLStatus(){
		return statusServices.getAllStatus();
}
	
	@PostMapping("/Add")
	public Status AddStatus(@RequestBody Status S) {
		return statusServices.saveStatus(S);
}

      
    @DeleteMapping("/delete")
    public void DeleteStatus(@RequestBody Status S) {
    	statusServices.deleteStatus(S);
    }
}