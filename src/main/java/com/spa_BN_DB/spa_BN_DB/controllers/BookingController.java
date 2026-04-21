package com.spa_BN_DB.spa_BN_DB.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spa_BN_DB.spa_BN_DB.models.Booking;
import com.spa_BN_DB.spa_BN_DB.services.BookingRepository;



@RestController
@CrossOrigin(origins = "${ALLOWED_ORIGIN:http://localhost:5173}")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping(value = "/", produces = "text/html")
    public String health() {
        return "Spa BN DB IS UP AND RUNNING =) go to the booking  <a href=\"https://stingray-app-37egs.ondigitalocean.app/\">FRONTEND/</a>";
    }

    @GetMapping("/bookings")
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    @PostMapping("/bookings")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }

   
    
    
    
}
