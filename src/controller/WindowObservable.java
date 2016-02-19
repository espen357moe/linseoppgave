package controller;

import java.awt.Rectangle;
import java.util.Observable;

public class WindowObservable extends Observable {
	
	public void setValue(Rectangle r) {
		setChanged();
		notifyObservers(r);
		clearChanged();
	}
}
