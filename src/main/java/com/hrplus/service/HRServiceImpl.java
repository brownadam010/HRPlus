package com.hrplus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrplus.dao.HRRepository;
import com.hrplus.entity.FinanceEmp;
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

	@Override
	public HREmp findById(int theId) {
		Optional<HREmp> hrId = hrRepository.findById(theId);
		
		HREmp theHR = null;
		
		if (hrId.isPresent()) {
			theHR = hrId.get();
		}
		
		else 
		{
			
			//faculty id not found
			throw new RuntimeException ("The financeID you've entered is invalid. - " + theId);
		}
		
		return theHR;
	}

	@Override
	public void deleteById(int theHR) {
		hrRepository.deleteById(theHR);
		
	}
}
