package com.hrplus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrplus.entity.MarketingEmp;

public interface MarketingRepository extends JpaRepository<MarketingEmp, Integer> {
	
	public List<MarketingEmp> findAllByOrderByLastNameAsc();

}
