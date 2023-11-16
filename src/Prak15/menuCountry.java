package Prak15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class menuCountry extends JFrame implements ActionListener
{
    private JComboBox<String> menuComboBox;
    private JLabel countryInfoLabel;

    String[] countries = { "Россия", "Германия", "США" };
    String[] countryInfo = {
            "Россия - лучшая страна в мире",
            "Германия - крупная экономика в Европе",
            "США - Военная и экономическая держава"
    };

    public menuCountry()
    {
        setTitle("Выбор меню");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        menuComboBox = new JComboBox<>(countries);
        menuComboBox.addActionListener(this);

        countryInfoLabel = new JLabel("");

        panel.add(menuComboBox);
        panel.add(countryInfoLabel);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args)
    {
        new menuCountry();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String selectedCountry = (String) menuComboBox.getSelectedItem();

        String info = "";
        for (int i = 0; i < countries.length; i++) {
            if (selectedCountry.equals(countries[i])) {
                info = countryInfo[i];
                break;
            }
        }

        countryInfoLabel.setText(info);
    }
}

