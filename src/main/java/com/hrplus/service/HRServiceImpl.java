package com.hrplus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrplus.dao.HRRepository;
import com.hrplus.entity.HREmp;

@Service
public class HRServiceImpl implements HRService {

	public HRRepository hrRepository;
	
	@Autowired
	public HRServiceImpl(HRRepository theHrRepository) {
		hrRepository = theHrRepository;
	}
	
	@Override
	public List<HREmp> findAll() {
		// TODO Auto-generated method stub
		return hrRepository.findAllByOrderByLastNameAsc();
	}
	
	@Override
	public void save(HREmp theHR) {
		// TODO Auto-generated method stub
		hrRepository.save(theHR);

	}
}
