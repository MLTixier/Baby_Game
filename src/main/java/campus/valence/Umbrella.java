package campus.valence;

import javax.swing.*;
import java.awt.*;

public class Umbrella {

    private final JPanel panel;

    Umbrella(Color bgColor, int startX, int startY) {
         panel = new JPanel();
        panel.setBounds(startX, startY, 90, 90);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);

        JPanel coin1 = new JPanel();
        coin1.setBounds(0, 60, 40, 30);
        coin1.setBackground(bgColor);
        panel.add(coin1);

        JPanel coin2 = new JPanel();
        coin2.setBounds(50, 60, 40, 30);
        coin2.setBackground(bgColor);
        panel.add(coin2);

        JPanel coin3 = new JPanel();
        coin3.setBounds(0, 0, 35, 20);
        coin3.setBackground(bgColor);
        panel.add(coin3);

        JPanel coin4 = new JPanel();
        coin4.setBounds(55, 0, 35, 20);
        coin4.setBackground(bgColor);
        panel.add(coin4);

        JPanel coin5 = new JPanel();
        coin5.setBounds(0, 20, 15, 15);
        coin5.setBackground(bgColor);
        panel.add(coin5);

        JPanel coin6 = new JPanel();
        coin6.setBounds(75, 20, 15, 15);
        coin6.setBackground(bgColor);
        panel.add(coin6);

        JPanel coin7 = new JPanel();
        coin7.setBounds(35, 0, 30, 10);
        coin7.setBackground(bgColor);
        panel.add(coin7);

        JPanel coin8 = new JPanel();
        coin8.setBounds(0, 35, 5, 5);
        coin8.setBackground(bgColor);
        panel.add(coin8);

        JPanel coin9 = new JPanel();
        coin9.setBounds(85, 35, 5, 5);
        coin9.setBackground(bgColor);
        panel.add(coin9);

    }

    public JPanel getPanel() {
        return panel;
    }
}
