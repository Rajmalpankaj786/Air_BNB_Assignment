package com.airBnb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airBnb.Entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
