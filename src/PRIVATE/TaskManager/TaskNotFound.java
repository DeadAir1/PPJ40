package PRIVATE.TaskManager;

public class TaskNotFound extends RuntimeException {
    public TaskNotFound(String message) {
        super(message);
    }
}
