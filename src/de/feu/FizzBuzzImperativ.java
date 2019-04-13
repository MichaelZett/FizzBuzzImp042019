package de.feu;

public class FizzBuzzImperativ {

	public static void main(String[] args) {
		new FizzBuzzImperativ().doFizzBuzz();
	}

	void doFizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(determineWord(i));
			if (i < 100) {
				System.out.print(", ");
			}
		}
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
