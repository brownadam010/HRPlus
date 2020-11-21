package com.hrplus.service;

import java.util.List;

import com.hrplus.entity.FinanceEmp;

public interface FinanceService {

	public List<FinanceEmp> findAll();

	 public FinanceEmp findById(int theId);

	public void save(FinanceEmp theFaculty);

	public void deleteById(int theId);
}
