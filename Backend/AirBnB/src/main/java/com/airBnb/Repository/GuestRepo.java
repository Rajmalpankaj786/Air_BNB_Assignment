package com.airBnb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airBnb.Entity.Guest;

public interface GuestRepo extends JpaRepository<Guest, Integer> {

}
