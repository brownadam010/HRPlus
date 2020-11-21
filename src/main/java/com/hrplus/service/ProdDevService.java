package com.hrplus.service;

import java.util.List;

import com.hrplus.entity.ProdDevEmp;

public interface ProdDevService {

	public List<ProdDevEmp> findAll();

	public ProdDevEmp findById(int theId);

	public void save(ProdDevEmp theFaculty);

	public void deleteById(int theId);
}
