package com.airBnb.Service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.airBnb.Entity.Host;
import com.airBnb.Repository.HostRepo;

@Service
public class HostService {

	private HostRepo hostRepo;
	
	public Host addHost(Host host) {
		return hostRepo.save(host);
	}
	
	public List<Host> viewallHost(){
		return hostRepo.findAll();
	}
	

	
}
