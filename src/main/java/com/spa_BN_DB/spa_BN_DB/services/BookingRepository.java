package com.spa_BN_DB.spa_BN_DB.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spa_BN_DB.spa_BN_DB.models.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
    
}
