package de.telekom.sea7.base;

public class Auto extends BaseObject {

	public Auto(int id) {
		super(id); // Aufruf des Constructors von BaseObject
	}

	public int getID() {
		return super.getId();
	}
@Override
	public void setId(int id) {
		this.toString();
		super.setId(id);
	}

	public String toString() {
		return "Auto: " + super.toString();
	
}
}