package com.keshav.solid.ocp.example;

// The open/closed principle states that according to new requirements the module should be open for 
//extension but closed for modification
public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.fetchInformation();
		Dog dog = new Dog();
		dog.fetchInformation();
		Tiger tiger = new Tiger();
		tiger.fetchInformation();
	}
}
