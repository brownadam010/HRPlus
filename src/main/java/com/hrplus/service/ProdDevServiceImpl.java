package com.hrplus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrplus.dao.ProdDevRepository;
import com.hrplus.entity.ProdDevEmp;

@Service
public class ProdDevServiceImpl implements ProdDevService {

	public ProdDevRepository prodDevRepository;

	@Autowired
	public ProdDevServiceImpl(ProdDevRepository theProdDevRepository) {
		prodDevRepository = theProdDevRepository;
	}

	@Override
	public List<ProdDevEmp> findAll() {
		// TODO Auto-generated method stub
		return prodDevRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public void save(ProdDevEmp theProdDev) {
		// TODO Auto-generated method stub
		prodDevRepository.save(theProdDev);

	}

}
