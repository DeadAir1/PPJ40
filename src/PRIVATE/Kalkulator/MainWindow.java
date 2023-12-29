package PRIVATE.Kalkulator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {
    private double liczba1,liczba2,wynnik;
    private char operator;
    JTextField textField=new JTextField();
    MainWindow(){
        this.setSize(new Dimension(300,400));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        String buttons[]={"7","8","9","/","4","5","6","*",
        "1","2","3","-","0","=","+"};
        JPanel panel=new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(textField,BorderLayout.NORTH);
        JPanel buttonPanel=new JPanel(new GridLayout(4,4));
        for(String button:buttons){
            JButton but=new JButton(button);
            but.addActionListener(this);
            buttonPanel.add(but);
        }
        panel.add(buttonPanel,BorderLayout.CENTER);
        this.add(panel);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        MainWindow window=new MainWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
    private double wykonajOperacje() {
        switch (operator) {
            case '+':
                return liczba1 + liczba2;

            case '-':
                return liczba1 - liczba2;

            case '*':
                return liczba1 * liczba2;

            case '/':
                if (liczba2 != 0)
                    return liczba1 / liczba2;
                else {
                    JOptionPane.showMessageDialog(this, "Nie można dzielić przez zero!", "Błąd", JOptionPane.ERROR_MESSAGE);
                    return 0;
                }
        }
    return 0;}
}
