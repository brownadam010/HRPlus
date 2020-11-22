package com.hrplus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hr")
public class HREmp {

	//Set the fields	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="vacation_total")
	private int vacaAvailable;
	
	@Column(name="vacation_taken")
	private int vacaTaken;
	
	@Column(name="vacation_left")
	private int vacaLeft;
	
	@Column(name="401k_amount")
	private String investments;
	
	public HREmp() {
		
	}

	public HREmp(int id, String firstName, String lastName, String salary, int vacaAvailable, int vacaTaken, int vacaLeft,
			String investments) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.vacaAvailable = vacaAvailable;
		this.vacaTaken = vacaTaken;
		this.vacaLeft = vacaLeft;
		this.investments = investments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getVacaAvailable() {
		return vacaAvailable;
	}

	public void setVacaAvailable(int vacaAvailable) {
		this.vacaAvailable = vacaAvailable;
	}

	public int getVacaTaken() {
		return vacaTaken;
	}

	public void setVacaTaken(int vacaTaken) {
		this.vacaTaken = vacaTaken;
	}

	public int getVacaLeft() {
		return vacaLeft;
	}

	public void setVacaLeft(int vacaLeft) {
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
		return "HREmp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", vacaAvailable=" + vacaAvailable
				+ ", vacaTaken=" + vacaTaken + ", vacaLeft=" + vacaLeft + ", investments=" + investments + "]";
	}
	
	
}
