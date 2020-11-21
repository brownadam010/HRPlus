package com.hrplus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrplus.dao.MarketingRepository;
import com.hrplus.entity.HREmp;
import com.hrplus.entity.MarketingEmp;

@Service
public class MarketingServiceImpl implements MarketingService {

	public MarketingRepository marketingRepository;

	@Autowired
	public MarketingServiceImpl(MarketingRepository theMarketingRepository) {
		marketingRepository = theMarketingRepository;
	}

	@Override
	public List<MarketingEmp> findAll() {
		// TODO Auto-generated method stub
		return marketingRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public void save(MarketingEmp theMarketing) {
		// TODO Auto-generated method stub
		marketingRepository.save(theMarketing);

	}

	@Override
	public MarketingEmp findById(int theId) {
		Optional<MarketingEmp> marketingId = marketingRepository.findById(theId);
		
		MarketingEmp theMarketing = null;
		
		if (marketingId.isPresent()) {
			theMarketing = marketingId.get();
		}
		
		else 
		{
			
			//faculty id not found
			throw new RuntimeException ("The financeID you've entered is invalid. - " + theId);
		}
		
		return theMarketing;
	}

	@Override
	public void deleteById(int theId) {
		marketingRepository.deleteById(theId);
		
	}

}
