package de.feu;

import java.util.LinkedList;
import java.util.List;

public class Classroom {
	private List<Kid> kids = new LinkedList<>();

	public void enter(Kid kid) {
		this.kids.add(kid);
	}

	public void playFizzBuzz(int lastNumber) {
		for (int i = 1; i <= lastNumber; i++) {
			final Kid currentKid = kids.get(i % kids.size());
			currentKid.sayWord(i);

			if (i < lastNumber) {
				System.out.print(", ");
			}
		}
	}

}
