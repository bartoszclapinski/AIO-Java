package Collections.Queues.Exercise;

import java.util.PriorityQueue;
import java.util.Queue;

public class TaskManager {

    private Queue<Task> tasks;

    public TaskManager() {
        this.tasks = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task getNextTask() {
        return tasks.poll();
    }

    public void printTasks() {
        System.out.println("Tasks: " + tasks);
    }
}
