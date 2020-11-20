package com.hrplus.service;

import java.util.List;

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
}
