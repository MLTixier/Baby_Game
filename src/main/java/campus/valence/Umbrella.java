package campus.valence;

import javax.swing.*;
import java.awt.*;

public class Umbrella {

    private final JPanel panel;

    private boolean visible ;

    Umbrella(Color bgColor, int startX, int startY) {
        ImageIcon imageUmbrella = new ImageIcon("./umbrella2.png");
        JLabel label = new JLabel(imageUmbrella);
        panel = new JPanel();
        panel.setBounds(startX, startY, 90, 90);
        panel.setBackground(bgColor);
        panel.add(label);
        visible = true;
    }

    public JPanel getPanel() {
        return panel;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean answer) {
        visible = answer;
    }
}

