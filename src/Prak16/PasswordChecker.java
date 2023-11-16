package Prak16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordChecker extends JFrame
{
    private JTextField serviceField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel resultLabel;

    public PasswordChecker()
    {
        setTitle("Password Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel serviceLabel = new JLabel("Service:");
        JLabel usernameLabel = new JLabel("User name:");
        JLabel passwordLabel = new JLabel("Password:");
        serviceField = new JTextField();
        usernameField = new JTextField();
        passwordField = new JPasswordField();

        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)

            {
                String password = new String(passwordField.getPassword());
                if (password.equals("228666"))
                {
                    resultLabel.setText("Correct password");
                    resultLabel.setForeground(Color.GREEN);
                }
                else
                {
                    resultLabel.setText("Incorrect password");
                    resultLabel.setForeground(Color.RED);
                }
                serviceField.setText("");
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(serviceLabel);
        inputPanel.add(serviceField);
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);

        resultLabel = new JLabel("");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);

        add(inputPanel, BorderLayout.CENTER);
        add(checkButton, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new PasswordChecker();
            }
        });
    }
}