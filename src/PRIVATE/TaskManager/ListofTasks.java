package PRIVATE.TaskManager;

public class ListofTasks {
    static Task[] list=new Task[10];
    static Task[] historyList=new Task[10];
    static int index=0;
    static int historyIndex=0;

    private ListofTasks() {
        }
        static public void add(Task task){
        list[index]=task;
        index++;
    }
}
