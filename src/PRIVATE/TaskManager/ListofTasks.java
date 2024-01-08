package PRIVATE.TaskManager;

public class ListofTasks {
    static Task listOfTasks[] = new Task[10];
    static int index=0;
    public void add(Task task){
        listOfTasks[index]=task;
        index++;
    }
}
