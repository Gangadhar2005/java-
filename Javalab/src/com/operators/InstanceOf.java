package com.operators;

class Animal {
}

class Dog extends Animal {
}

public class InstanceOf {
	public static void main(String[] args) {

		Dog d = new Dog();
		Animal a = new Animal();

		// Check object type
		System.out.println(d instanceof Dog);
		System.out.println(d instanceof Animal);
		System.out.println(d instanceof Object);
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog);

		System.out.println("****************************************************");

		String name = "Java";
		Integer number = 100;
		Double price = 25.5;

		System.out.println(name instanceof String);
		System.out.println(number instanceof Integer);
		System.out.println(price instanceof Double);

	}
}
