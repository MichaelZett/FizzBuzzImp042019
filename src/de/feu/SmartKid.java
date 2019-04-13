package de.feu;

public class SmartKid extends AbstractKid {
	public SmartKid(int i) {
		super(i);
	}

	@Override
	public String determineWord(int i) {
		if (i % Word.FIZZ.number == 0 && i % Word.BUZZ.number == 0) {
			return Word.FIZZ.representation + Word.BUZZ.representation;
		} else if (i % Word.FIZZ.number == 0) {
			return Word.FIZZ.representation;
		} else if (i % Word.BUZZ.number == 0) {
			return Word.BUZZ.representation;
		} else {
			return String.valueOf(i);
		}
	}
}
