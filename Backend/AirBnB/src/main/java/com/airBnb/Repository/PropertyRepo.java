package com.airBnb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airBnb.Entity.Property;

public interface PropertyRepo extends JpaRepository<Property, Integer> {

}
