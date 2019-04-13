package de.feu;

public class DumbKid extends AbstractKid {
	public DumbKid(int no) {
		super(no);
	}

	@Override
	public String determineWord(int i) {
		return String.valueOf(i);
	}

}
