package campus.valence;

import javax.swing.*;
import java.awt.*;

public class Baby {

    private static int STEP = 5;

    private final JPanel panel;

    Baby(Color bgColor) {
        ImageIcon imageBaby = new ImageIcon("baby-removebg2.png");
        JLabel label = new JLabel(imageBaby);
        panel = new JPanel();
        panel.setBounds(150, 490, 50, 75);
        panel.setBackground(bgColor);
        panel.add(label);

/*
        ajouterCoins(panel, bgColor, 5);

        JPanel oeil1 = new JPanel();
        oeil1.setBounds(10, 15, 5, 5);
        oeil1.setBackground(Color.BLACK);

        JPanel oeil2 = new JPanel();
        oeil2.setBounds(35, 15, 5, 5);
        oeil2.setBackground(Color.BLACK);

        JPanel bouche1 = new JPanel();
        bouche1.setBounds(15, 35, 20, 5);
        bouche1.setBackground(Color.BLACK);

        JPanel bouche2 = new JPanel();
        bouche2.setBounds(10, 30, 5, 5);
        bouche2.setBackground(Color.BLACK);

        JPanel bouche3 = new JPanel();
        bouche3.setBounds(35, 30, 5, 5);
        bouche3.setBackground(Color.BLACK);

        panel.add(oeil1);
        panel.add(oeil2);
        panel.add(bouche1);
        panel.add(bouche2);
        panel.add(bouche3);

 */

    }

    /*
    public void ajouterCoins(JPanel panel, Color color, int pas){
        int width = panel.getWidth();
        int height = panel.getHeight();

        JPanel coin1 = new JPanel();
        coin1.setBounds(0, 0, pas, pas);
        coin1.setBackground(color);
        panel.add(coin1);

        JPanel coin2 = new JPanel();
        coin2.setBounds(width-pas, 0, pas, pas);
        coin2.setBackground(color);
        panel.add(coin2);

        JPanel coin3 = new JPanel();
        coin3.setBounds(0, height-pas, pas, pas);
        coin3.setBackground(color);
        panel.add(coin3);

        JPanel coin4 = new JPanel();
        coin4.setBounds(width-pas, height-pas, 5, 5);
        coin4.setBackground(color);
        panel.add(coin4);
    }

 */

    public void moveLeft() {
        if (panel.getX() > 10) {
            moveX(-STEP);
        }
    }

    public void moveRight() {
        if (panel.getX() < 340) {
            moveX(STEP);
        }
    }

    private void moveX(int step) {
        Rectangle bounds = panel.getBounds();
        panel.setBounds(bounds.x + step, bounds.y, bounds.width, bounds.height);
    }


    public JPanel getPanel() {
        return panel;
    }
}
