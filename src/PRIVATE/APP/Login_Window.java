package PRIVATE.APP;

import javax.swing.*;
import java.awt.*;

public class Login_Window extends JFrame {
    Login_Window (){
            this.setSize(new Dimension(800,600));
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);
            JPanel panel=new JPanel(new FlowLayout());
            JLabel log=new JLabel("Login");
            panel.add(log);
            String loginString="";
            JTextField login=new JTextField(loginString);
            panel.add(login);


    }

}
