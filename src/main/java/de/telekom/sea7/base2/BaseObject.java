package de.telekom.sea7.base2;

public class BaseObject /* extends Object */ {

public BaseObject( Object parent, int id ) {
this.parent = parent;
this.id = id;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public Object getParent() {
return parent;
}

private int id;
private Object parent;

}


