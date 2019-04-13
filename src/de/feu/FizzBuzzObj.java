package de.feu;

public class FizzBuzzObj {

	public static void main(String[] args) {
		Classroom room = new Classroom();

		for (int i = 0; i < 5; i++) {
			room.enter(createKid(i));
		}

		room.playFizzBuzz(100);
	}

	static Kid createKid(int i) {
		return i % 2 == 0 ? new SmartKid(i) : new DumbKid(i);
	}

}
