package com.hrplus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrplus.entity.HREmp;

public interface HRRepository extends JpaRepository<HREmp, Integer>{
	
	//method to sort fetch from database in ascending format on last name
	public List<HREmp> findAllByOrderByLastNameAsc();
}
