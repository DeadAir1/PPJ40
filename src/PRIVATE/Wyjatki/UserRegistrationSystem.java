package PRIVATE.Wyjatki;

import java.util.Arrays;
import java.util.Scanner;

class User{
     String userName;


    public User(String userName) {
        this.userName = userName;
    }
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
class UserNameExistsException extends Exception{
    public UserNameExistsException(String message) {
        super(message);
    }
}
class UserNotFoundException extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}

public class UserRegistrationSystem {
    User userArr[]=new User[10];
    private int index=0;
    public void registerUser (String userName) throws UserNameExistsException{
        for (int i=0; i<10 ; i++) {
            if(userArr[i]!=null)
                if (userArr[i].userName.equals(userName)) throw new UserNameExistsException("User exists with index  " + i );
        }
        userArr[index]=new User(userName);
        index++;
    }
    public void userDelete(String name) throws UserNotFoundException{
        for (int i = 0; i < userArr.length ; i++) {
            if(userArr[i]!=null)
                if(userArr[i].userName.equals(name)){
                    userArr[i]=null;
                    for (int j = i; j < userArr.length-1 ; j++) {
                                User t=userArr[j];
                                userArr[j]=userArr[j+1];
                                userArr[j+1]=t;
                    }
                    return;
                }
        }
        throw new UserNotFoundException("UserNotFound!");

    }
}
class Main{
    public static void main(String[] args) {
        UserRegistrationSystem sys=new UserRegistrationSystem();
        String name="Olek";
        for (int i = 0; i <10 ; i++) {
            try{
                sys.registerUser(name + i);
            }catch(UserNameExistsException e){
                e.printStackTrace();
            }
        }
        System.out.println(Arrays.toString(sys.userArr));
        try {
            sys.userDelete("Olek290");
        }catch(UserNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(sys.userArr));
    }
}