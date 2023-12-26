package Lab6;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DISPLAY {

    DISPLAY() {
        JFrame frame = new JFrame("DISPLAY");
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("LOGIN SUCCESSFUL");

        frame.add(label);
        frame.setSize(400, 400);
        frame.setVisible(true);
        
    }
}

public class qno2 implements ActionListener {

    JFrame Login1;
    JLabel Username;
    JLabel Password;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton LoginButton;
    JButton SignupButton;

    qno2() {
        Login1 = new JFrame("Login Form");
        Login1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login1.setSize(400, 300);

        Username = new JLabel("Username:");
        usernameField = new JTextField(10);
        Password = new JLabel("Password:");
        passwordField = new JPasswordField(10); 
        LoginButton = new JButton("Login"); 
        LoginButton.addActionListener(this);
        SignupButton = new JButton("Signup");
        SignupButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));
        panel.add(Username);
        panel.add(usernameField);
        panel.add(Password);
        panel.add(passwordField);
        panel.add(LoginButton);
        panel.add(SignupButton);

        Login1.add(panel);
        Login1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == LoginButton && !usernameField.getText().isEmpty() && passwordField.getPassword().length > 0) {
            Login1.dispose();
             SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DISPLAY();
            }
        });
        } else if (e.getSource() == SignupButton) {
            Login1.dispose();
            new qno1();
        }
    }
    public static void main(String[] args) {
        new qno2();
    }
}
