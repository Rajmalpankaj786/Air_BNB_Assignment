package com.airBnb.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.airBnb.Entity.Host;

public interface HostRepo extends JpaRepository<Host, Integer> {
    
}
