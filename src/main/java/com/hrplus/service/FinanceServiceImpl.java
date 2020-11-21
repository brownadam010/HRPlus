package com.hrplus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrplus.dao.FinanceRepository;
import com.hrplus.entity.FinanceEmp;

@Service
public class FinanceServiceImpl implements FinanceService {

	public FinanceRepository financeRepository;

	@Autowired
	public FinanceServiceImpl(FinanceRepository theFinanceRepository) {
		financeRepository = theFinanceRepository;
	}

	@Override
	public List<FinanceEmp> findAll() {
		// TODO Auto-generated method stub
		return financeRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public void save(FinanceEmp theFinance) {
		// TODO Auto-generated method stub
		financeRepository.save(theFinance);

	}

	@Override
	public FinanceEmp findById(int theId) {

		Optional<FinanceEmp> financeId = financeRepository.findById(theId);
		
		FinanceEmp theFinance = null;
		
		if (financeId.isPresent()) {
			theFinance = financeId.get();
		}
		
		else 
		{
			
			//faculty id not found
			throw new RuntimeException ("The financeID you've entered is invalid. - " + theId);
		}
		
		return theFinance;
	}

	@Override
	public void deleteById(int theId) {
		financeRepository.deleteById(theId);
		
	}
}
