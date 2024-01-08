package PRIVATE.TaskManager;

import java.time.LocalDate;

public class Task {
    enum Priority{
        HIGH,MIDDLE,LOW
    }
    private Priority priority;

    private String title;
    private String date;
    LocalDate localDate= LocalDate.now();

    private boolean done;

    private String text;
    public Task(String title) {
        this.title = title;
        this.date=localDate.toString();
        this.done=false;
        this.priority=Priority.LOW;
        this.text=null;
    }
    public Task(String title,String text) {
        this.title = title;
        this.date=localDate.toString();
        this.done=false;
        this.priority=Priority.LOW;
        this.text=text;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title=" + title + '\n' +
                ",priority=" + priority  + '\n' +
                ", date='" + date + '\n' +
                ", localDate=" + localDate +'\n' +
                ", done=" + done + '\n' +
                ", text='" + text + '\n' +
                '}';
    }
}
