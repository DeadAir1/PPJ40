package PRIVATE.TaskManager;

import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        String infoString="This notepad, created by Oleksandr Voloshyn;\n" +
                "Student of PJATK,student number s27565;\n"+
                "Here you have n options: \n" +
                "1.create;\n" +
                "2.exit;\n" ;

        System.out.println("Hi you opened your TaskManager,\n" +
                "if you need help,type it;");
        Scanner in=new Scanner(System.in);
        String command=" ";
        while(true){
            command=in.next();
            switch(command){
                case "help" : {
                    System.out.println(infoString);
                }break;
                case "create" : {
                    System.out.println("Please enter a title for your task: ");
                    String title=in.next();
                    System.out.println("You want to add note to your task?Y/N");
                    char ans=in.next().charAt(0);
                    Task task;
                    if(ans=='Y' || ans =='y'){
                        System.out.println("Please enter your note: ");
                        String text=in.next();
                         task=new Task(title,text);
                    }else
                         task = new Task(title);
                    ListofTasks.add(task);
                    TaskManager taskManager;
                    try {
                         taskManager = new TaskManager(title);
                    }catch(TaskNotFound e){
                        System.out.println(e.toString());
                        continue;
                    }
                    System.out.println("Priority for your task is low,do you want to set another priority?Y/N");
                    ans=in.next().charAt(0);
                    if(ans=='Y' || ans =='y'){
                        System.out.println("You can change priority for \"High\" or \"Middle\"");
                        taskManager.setPriority(in.nextLine().toUpperCase());
                    }
                }
                break;
                case "edit":{
                    String title=in.next();
                    TaskManager taskManager;
                    try {
                        taskManager = new TaskManager(title);
                    }catch(TaskNotFound e){
                        System.out.println(e.toString());
                        continue;
                    }
                    System.out.println("Its okay;");
                }
                case "exit" : {
                    System.out.println("Program closed!");
                    return;
                }
            }
        }
    }
}
