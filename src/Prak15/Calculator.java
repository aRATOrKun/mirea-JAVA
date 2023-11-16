package Prak15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator
{
    private JFrame frame;
    private JTextField firstNumberTextField;
    private JTextField secondNumberTextField;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JLabel resultLabel;

    public Calculator()
    {
        frame = new JFrame("Elementary Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel firstNumberLabel = new JLabel("First Number: ");
        firstNumberTextField = new JTextField();
        JLabel secondNumberLabel = new JLabel("Second Number: ");
        secondNumberTextField = new JTextField();

        panel.add(firstNumberLabel);
        panel.add(firstNumberTextField);
        panel.add(secondNumberLabel);
        panel.add(secondNumberTextField);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        addButton.addActionListener(new OperationListener());
        subtractButton.addActionListener(new OperationListener());
        multiplyButton.addActionListener(new OperationListener());
        divideButton.addActionListener(new OperationListener());

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        JLabel resultTextLabel = new JLabel("Result: ");
        resultLabel = new JLabel();

        panel.add(resultTextLabel);
        panel.add(resultLabel);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
    }

    private class OperationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double firstNumber = Double.parseDouble(firstNumberTextField.getText());
            double secondNumber = Double.parseDouble(secondNumberTextField.getText());

            if (e.getSource() == addButton)
            {
                double result = firstNumber + secondNumber;
                resultLabel.setText(Double.toString(result));
            }
            else if (e.getSource() == subtractButton)
            {
                double result = firstNumber - secondNumber;
                resultLabel.setText(Double.toString(result));
            }
            else if (e.getSource() == multiplyButton)
            {
                double result = firstNumber * secondNumber;
                resultLabel.setText(Double.toString(result));
            }
            else if (e.getSource() == divideButton)
            {
                if (secondNumber != 0)
                {
                    double result = firstNumber / secondNumber;
                    resultLabel.setText(Double.toString(result));
                } else
                    resultLabel.setText("Cannot divide by 0");
            }
        }
    }
}
