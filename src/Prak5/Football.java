package Prak5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame
{
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public Football()
    {
        setTitle("Football Match Simulator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                milanScore++;
                updateResult();
                lastScorerLabel.setText("Last Scorer: AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                madridScore++;
                updateResult();
                lastScorerLabel.setText("Last Scorer: Real Madrid");
            }
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    private void updateResult()
    {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore)
            winnerLabel.setText("Winner: AC Milan");
        else if (madridScore > milanScore)
            winnerLabel.setText("Winner: Real Madrid");
        else
            winnerLabel.setText("Winner: DRAW");
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                Football simulator = new Football();
                simulator.setLocationRelativeTo(null);
                simulator.setVisible(true);
            }
        });
    }
}
