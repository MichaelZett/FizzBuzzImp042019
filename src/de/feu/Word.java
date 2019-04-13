package de.feu;

public enum Word {
	FIZZ("Fizz", 3), BUZZ("Buzz", 5);

	String representation;
	int number;

	private Word(String representation, int number) {
		this.representation = representation;
		this.number = number;
	}
}
