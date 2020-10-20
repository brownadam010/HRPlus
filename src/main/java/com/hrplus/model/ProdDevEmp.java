package com.hrplus.model;

public class ProdDevEmp {

	private String id;
	private String name;
	private String salary;
	private String vacaAvailable;
	private String vacaTaken;
	private String vacaLeft;
	private String investments;
	
	public ProdDevEmp() {
		
	}

	public ProdDevEmp(String id, String name, String salary, String vacaAvailable, String vacaTaken, String vacaLeft,
			String investments) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.vacaAvailable = vacaAvailable;
		this.vacaTaken = vacaTaken;
		this.vacaLeft = vacaLeft;
		this.investments = investments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getVacaAvailable() {
		return vacaAvailable;
	}

	public void setVacaAvailable(String vacaAvailable) {
		this.vacaAvailable = vacaAvailable;
	}

	public String getVacaTaken() {
		return vacaTaken;
	}

	public void setVacaTaken(String vacaTaken) {
		this.vacaTaken = vacaTaken;
	}

	public String getVacaLeft() {
		return vacaLeft;
	}

	public void setVacaLeft(String vacaLeft) {
		this.vacaLeft = vacaLeft;
	}

	public String getInvestments() {
		return investments;
	}

	public void setInvestments(String investments) {
		this.investments = investments;
	}

	@Override
	public String toString() {
		return "ProdDevEmp [id=" + id + ", name=" + name + ", salary=" + salary + ", vacaAvailable=" + vacaAvailable
				+ ", vacaTaken=" + vacaTaken + ", vacaLeft=" + vacaLeft + ", investments=" + investments + "]";
	}
	
	
}
