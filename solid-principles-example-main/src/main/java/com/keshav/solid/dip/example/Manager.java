package com.keshav.solid.dip.example;

// use the abstraction layer 
public class Manager {
	private Employee employee;

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void manager() {
		employee.work();
	}
}
