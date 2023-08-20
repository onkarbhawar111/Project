package com.app.vehiclerent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.vehiclerent.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
