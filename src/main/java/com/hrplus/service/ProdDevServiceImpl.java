package com.hrplus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrplus.dao.ProdDevRepository;
import com.hrplus.entity.MarketingEmp;
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

	@Override
	public ProdDevEmp findById(int theId) {
		Optional<ProdDevEmp> prodDevId = prodDevRepository.findById(theId);
		
		ProdDevEmp theProdDev = null;
		
		if (prodDevId.isPresent()) {
			theProdDev = prodDevId.get();
		}
		
		else 
		{
			
			//faculty id not found
			throw new RuntimeException ("The financeID you've entered is invalid. - " + theId);
		}
		
		return theProdDev;
	}

	@Override
	public void deleteById(int theId) {
		prodDevRepository.deleteById(theId);
		
	}

}
