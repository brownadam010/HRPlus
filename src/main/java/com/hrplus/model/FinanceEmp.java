package com.hrplus.model;

public class FinanceEmp extends Employee {

	public FinanceEmp(int id, String name, String salary, String vacaAvailable, String vacaTaken, String vacaLeft,
			String investments) {
				super(id, name, salary, vacaAvailable, vacaTaken, vacaLeft, investments);
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.vacaAvailable = vacaAvailable;
		this.vacaTaken = vacaTaken;
		this.vacaLeft = vacaLeft;
		this.investments = investments;
	}

	@Override
	public String toString() {
		return "FinanceEmp [id=" + id + ", name=" + name + ", salary=" + salary + ", vacaAvailable=" + vacaAvailable
				+ ", vacaTaken=" + vacaTaken + ", vacaLeft=" + vacaLeft + ", investments=" + investments + "]";
	}
	
	
}
