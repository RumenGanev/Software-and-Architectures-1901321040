package uni.fmi;

import java.util.Observable;
import java.util.Observer;

public class Viewer implements Observer {
	private boolean position = false;

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Boolean) {
			position = (Boolean) arg;
			System.out.println("Viewer is now " + (position ? "standing" : "lying down"));
		}
	}
}
