package de.feu;

import java.util.LinkedList;
import java.util.List;

public class Classroom {
	private List<Kid> kids = new LinkedList<>();

	public void enter(Kid kid) {
		this.kids.add(kid);
	}

	public void playFizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			kids.get(i % kids.size()).sayWord(i);

			if (i < 100) {
				System.out.print(", ");
			}
		}
	}

}
