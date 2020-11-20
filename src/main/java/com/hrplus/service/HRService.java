package com.hrplus.service;

import java.util.List;

import com.hrplus.entity.HREmp;

public interface HRService {

	public List<HREmp> findAll();
	
	//public HREmp findById(int theId);
	
	public void save(HREmp theFaculty);
	
	//public void deleteById(int theId);
}
