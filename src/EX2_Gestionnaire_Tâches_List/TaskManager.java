package EX2_Gestionnaire_Tâches_List;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	public static void main(String[] args) {
		
		List <Task> tasks = new ArrayList <>();
		tasks.add(new Task("Apprendre Java Collections",true));
		tasks.add(new Task("Faire les courses ", false));
		
		tasks.get(0).setCompleted(true);
		
		for (Task t : tasks ) {
			System.out.println(t);
		}
	}

}
