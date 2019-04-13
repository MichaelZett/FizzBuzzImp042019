package de.feu;

public interface Kid {
	default void sayWord(int i) {
		System.out.print("kid " + getNo() + " says: " + determineWord(i));
	}

	String determineWord(int i);

	int getNo();

}