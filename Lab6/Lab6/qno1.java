package Lab6;

import javax.swing.*;
import java.awt.*;

public class qno1 {
     public qno1() {
        JFrame userForm = new JFrame("User Addition Form");
        userForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userForm.setSize(400, 300);

        JLabel Name = new JLabel("Username:");
        JTextField nameField = new JTextField(10);

        JLabel Address = new JLabel("Address:");
        JTextField addressField = new JTextField(10);

        JLabel Country = new JLabel("Country:");
        String[] countries = {"Nepal", "Usa", "China"};
        JComboBox<String> Countrychoice = new JComboBox<>(countries);

        JLabel Email = new JLabel("Email: ");
        JTextField emailField = new JTextField(10);

        JLabel Gender = new JLabel("Gender:");
        JCheckBox MALE = new JCheckBox("Male");
        JCheckBox Female = new JCheckBox("Female");
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(MALE);
        genderButtonGroup.add(Female);

        JLabel MaritalStatus = new JLabel("Marital Status: ");
        JCheckBox Married = new JCheckBox("Married");
        JCheckBox Unmarried = new JCheckBox("Unmarried");
        ButtonGroup maritalStatusButtonGroup = new ButtonGroup();
        maritalStatusButtonGroup.add(Married);
        maritalStatusButtonGroup.add(Unmarried);

        JLabel Terms_and_Policy = new JLabel("Terms and Policy: ");
        JCheckBox acceptterms = new JCheckBox("Do you Accept the terms");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));  // 0 rows means any number of rows, 2 columns
        panel.add(Name);
        panel.add(nameField);
        panel.add(Address);
        panel.add(addressField);
        panel.add(Email);
        panel.add(emailField);
        panel.add(Country);
        panel.add(Countrychoice);

        // Gender components in a new row
        panel.add(Gender);
        panel.add(new JPanel()); // Placeholder for alignment
        panel.add(MALE);
        panel.add(Female);

        // Marital Status components in a new row
        panel.add(MaritalStatus);
        panel.add(new JPanel()); // Placeholder for alignment
        panel.add(Married);
        panel.add(Unmarried);

        panel.add(Terms_and_Policy);
        panel.add(acceptterms);
        panel.add(new JLabel("Signin:"));
        panel.add(new JButton("Signup"));

        userForm.add(panel);
        userForm.setVisible(true);
    }

    public static void main(String[] args) {
        new qno1();
    }
}