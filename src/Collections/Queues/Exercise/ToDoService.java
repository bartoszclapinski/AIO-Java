package Collections.Queues.Exercise;

import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoService {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new Task("Task 1", "Description 1", Priority.LOW));
        taskManager.addTask(new Task("Task 2", "Description 2", Priority.MEDIUM));
        taskManager.addTask(new Task("Task 3", "Description 3", Priority.HIGH));

        taskManager.printTasks();
        System.out.println("Next task: " + taskManager.getNextTask());
    }
    
}
