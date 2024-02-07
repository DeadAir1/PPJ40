package PRIVATE.Wyjatki.Logowanie;

import java.util.Scanner;

class User{
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class LogSys {
    User userArr[]=new User[10];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("login :");
        String login=in.next();
    }
}

