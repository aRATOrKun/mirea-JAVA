package Prak16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener
{
    private JTextArea textArea;
    private JMenu fontMenu;
    private JMenu colorMenu;

    public static void main(String[] args)
    {
        new TextEditor();
    }

    public TextEditor()
    {
        setTitle("Text Editor");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 12));

        fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");
        timesNewRomanItem.addActionListener(this);
        msSansSerifItem.addActionListener(this);
        courierNewItem.addActionListener(this);
        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");
        blueItem.addActionListener(this);
        redItem.addActionListener(this);
        blackItem.addActionListener(this);
        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fontMenu);
        menuBar.add(colorMenu);

        setJMenuBar(menuBar);
        add(new JScrollPane(textArea));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();

        if (command.equals("Times New Roman"))
            textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        else if (command.equals("MS Sans Serif"))
            textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
        else if (command.equals("Courier New"))
            textArea.setFont(new Font("Courier New", Font.PLAIN, 12));

        if (command.equals("Синий"))
            textArea.setForeground(Color.BLUE);
        else if (command.equals("Красный"))
            textArea.setForeground(Color.RED);
        else if (command.equals("Черный"))
            textArea.setForeground(Color.BLACK);
    }
}