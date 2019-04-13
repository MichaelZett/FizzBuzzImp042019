package de.feu;

public class FizzBuzzObj {

	public static void main(String[] args) {
		Classroom room = new Classroom();

		for (int i = 0; i < 5; i++) {
			room.enter(new Kid(i));
		}

		room.playFizzBuzz();
	}

}
