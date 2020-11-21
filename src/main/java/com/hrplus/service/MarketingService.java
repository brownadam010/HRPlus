package com.hrplus.service;

import java.util.List;

import com.hrplus.entity.MarketingEmp;

public interface MarketingService {

	public List<MarketingEmp> findAll();

	public MarketingEmp findById(int theId);

	public void save(MarketingEmp theFaculty);

	public void deleteById(int theId);
}
