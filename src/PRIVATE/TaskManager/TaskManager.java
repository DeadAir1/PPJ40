package PRIVATE.TaskManager;

public class TaskManager {
    private Task task;
    public TaskManager(Task task) {
        this.task = task;
    }
    
     public void setPriority(String priority){
        priority=priority.toUpperCase();
        Task.Priority priority1=switch (priority){
            case "HIGH" -> Task.Priority.HIGH;
            case "MIDDLE" -> Task.Priority.MIDDLE;
            case "LOW" -> Task.Priority.LOW;
            default -> throw new PriorityException("An Impossible priority!");
        };
    }
}
