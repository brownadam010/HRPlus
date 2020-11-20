package com.hrplus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrplus.entity.FinanceEmp;

public interface FinanceRepository extends JpaRepository<FinanceEmp, Integer> {
	
	public List<FinanceEmp> findAllByOrderByLastNameAsc();

}
