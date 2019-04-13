package de.feu;

public abstract class AbstractKid implements Kid {
	private int no;

	public AbstractKid(int no) {
		super();
		this.no = no;
	}

	@Override
	public int getNo() {
		return no;
	}

	@Override
	public String toString() {
		return getClass().getName() + "#" + no;
	}
}