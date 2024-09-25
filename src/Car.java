/*
 * Created on 2024-09-25
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Random;

public class Car {

	private String model;

	// Constructors
	public Car(String model) {
		this.model = model;
	}

	public Car() {
		this.model = "Blooper";
	}

	// Getters & Setters
	public String getModel() {
		return this.model;
	}

	// Behavior
	public void drive() {
		System.out.println(this.model + " started to drive!");
	}

	public void accelerate() {
		System.out.println(model + " is now driving at a different speed" + "!");
	}
}