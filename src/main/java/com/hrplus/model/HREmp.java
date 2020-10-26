package com.hrplus.model;

public class HREmp extends Employee{
	
	public HREmp(int id, String name, String salary, String vacaAvailable, String vacaTaken, String vacaLeft,
			String investments) {
				super(id, name, salary, vacaAvailable, vacaTaken, vacaLeft, investments);
	}

	@Override
	public String toString() {
		return "HREmp [id=" + id + ", name=" + name + ", salary=" + salary + ", vacaAvailable=" + vacaAvailable
				+ ", vacaTaken=" + vacaTaken + ", vacaLeft=" + vacaLeft + ", investments=" + investments + "]";
	}
	
	
}
