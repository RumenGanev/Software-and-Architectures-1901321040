package uni.fmi;

public class main {

	public static void main(String[] args) {
		InstructorImp inst = new InstructorImp();
		Trainer trainer = new Trainer();
		
		Viewer viewer1 = new Viewer();
		Viewer viewer2 = new Viewer();
		Viewer viewer3 = new Viewer();
		
		trainer.addObserver(viewer1);
		trainer.addObserver(viewer2);
		trainer.addObserver(viewer3);
		
		AutomatedTask tasker = new AutomatedTask(6000);
		tasker.run(inst, trainer);
	}

}
