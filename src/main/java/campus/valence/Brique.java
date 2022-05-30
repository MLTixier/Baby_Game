package campus.valence;

import javax.swing.*;
import java.awt.*;

public abstract class Brique extends JPanel {

    private JPanel panelBrique;
    private Color bgColor;
    private Color color;
    private int X ;
    private int Y ;
    private int width ;
    private int height ;


    public Brique(int X, int Y, int width, int height, Color color, Color bgColor, int pas){
        panelBrique = new JPanel();
        this.bgColor = bgColor;
        this.color = color;
        this.X = X;
        this.Y = Y;
        this.width = width;
        this.height = height;
        panelBrique.setBounds(X, Y, width, height);
        panelBrique.setLayout(null);
        ajouterCoins(panelBrique, color, pas);
        panelBrique.setBackground(color);
    }

    public void ajouterCoins(JPanel panel, Color color, int pas) {
        int width = panel.getWidth();
        int height = panel.getHeight();

        JPanel coin1 = new JPanel();
        coin1.setBounds(0, 0, pas, pas);
        coin1.setBackground(color);
        panel.add(coin1);

        JPanel coin2 = new JPanel();
        coin2.setBounds(width - pas, 0, pas, pas);
        coin2.setBackground(color);
        panel.add(coin2);

        JPanel coin3 = new JPanel();
        coin3.setBounds(0, height - pas, pas, pas);
        coin3.setBackground(color);
        panel.add(coin3);

        JPanel coin4 = new JPanel();
        coin4.setBounds(width - pas, height - pas, 5, 5);
        coin4.setBackground(color);
        panel.add(coin4);
    }

    public JPanel getPanelBrique(){
        return panelBrique;
    }

    public void descendre(int deltaY){
        Y = Y + deltaY;
        panelBrique.setBounds(X, (Y+ deltaY), width, height);
    }

    @Override
    public int getY() {
        return Y;
    }

}
