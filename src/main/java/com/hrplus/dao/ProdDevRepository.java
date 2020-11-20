package com.hrplus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrplus.entity.ProdDevEmp;

public interface ProdDevRepository extends JpaRepository<ProdDevEmp, Integer> {
	
	public List<ProdDevEmp> findAllByOrderByLastNameAsc();

}
