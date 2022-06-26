package uni.fmi;

import java.util.Observable;

public class Trainer extends Observable {
	private boolean position = false;

	public void setPosition(boolean position) {
		this.position = position;
		System.out.println("Trainer is now " + (position ? "standing" : "lying down") + "\n");
		setChanged();
		notifyObservers(position);
	}
	
}
