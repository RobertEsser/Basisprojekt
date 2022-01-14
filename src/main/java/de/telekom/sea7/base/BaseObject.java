package de.telekom.sea7.base;

public class BaseObject /* extends Object */ {

	
	
	
	public BaseObject(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private String a;

	public String toString() {
		return "BaseObject: " + super.toString();
	}
	
}

