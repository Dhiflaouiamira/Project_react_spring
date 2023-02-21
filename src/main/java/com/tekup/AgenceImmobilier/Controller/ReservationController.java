
package com.tekup.AgenceImmobilier.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.AgenceImmobilier.Service.ReservationServices;
import com.tekup.AgenceImmobilier.model.Reservation;


@RestController
@RequestMapping({"/api/reservation"})

public class ReservationController {
	@Autowired
	private ReservationServices reservationServices;
	
	
	@GetMapping("/findAll")
	public List<Reservation> getALLReservation(){
		return reservationServices.getAllReservation();
}
	
	@PostMapping("/Add")
	public Reservation AddReservation(@RequestBody Reservation R) {
		return reservationServices.saveReservation(R);
}

      
    @DeleteMapping("/delete")
    public void DeleteReservation(@RequestBody Reservation R) {
    	reservationServices.deleteReservation(R);
    }
}

