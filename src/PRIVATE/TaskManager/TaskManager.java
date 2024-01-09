package PRIVATE.TaskManager;

public class TaskManager {
    private Task task;
    public TaskManager(String title) {
        for (int i = 0; i <ListofTasks.list.length ; i++) {
                if(ListofTasks.list[i]!=null){
                    if(ListofTasks.list[i].equals(title))
                        this.task= ListofTasks.list[i];
                }
        }if(this.task==null) throw new TaskNotFound("Task was not found in list!");

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
    public void taskEdit(Task task){
        System.out.println("This task information: " + '\n' + task.toString());
    }
}
