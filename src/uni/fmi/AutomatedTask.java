package uni.fmi;

public class AutomatedTask extends Thread{
	private long sleepInterval;
	
	public AutomatedTask(long sleepInterval) {
		this.sleepInterval = sleepInterval;
	}
	
	public void run(InstructorImp instructor, Trainer trainer) {
		while(true) {
			try {
				instructor.giveOrder(trainer);
				sleep(sleepInterval);
				System.out.println("\n");
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
		}
	}
}
