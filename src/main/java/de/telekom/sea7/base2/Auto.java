package de.telekom.sea7.base2;

public class Auto extends BaseObject {

public Auto(Object parent, int id) {
super(parent, id); // Aufruf des Constructors von BaseObject
}

public int getId() {
return super.getId();

// return this.getId(); !!! gefährlich, weil endlos
}

@Override // Verhindert Tipp-Fehler beim "überschreiben" von Methoden
public void setId(int id) {

super.setId(id);
}


}

