package uni.fmi;

public class InstructorImp implements Instructor {

	private boolean lastPosition = false;
	
	@Override
	public void giveOrder(Trainer trainer) {
		System.out.println("Instructor gives new order: " + (lastPosition ? "Lie down" : "Stand up"));
		lastPosition = !lastPosition;
		trainer.setPosition(lastPosition);
	}
}
