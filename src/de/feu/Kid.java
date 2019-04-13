package de.feu;

public class Kid {
	private int no;

	public Kid(int i) {
		this.no = i + 1;
	}

	public void sayWord(int i) {
		System.out.print("kid " + no + " says: " + determineWord(i));
	}

	String determineWord(int i) {
		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(i);
		}
	}
}
