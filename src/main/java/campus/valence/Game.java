package campus.valence;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game implements ActionListener {

    private Color BGCOLOR;
    private JFrame frame;
    private JPanel panel;
    private Baby baby;
    private Umbrella umbrella;
    private Timer timer ;

    Game() {

               this.BGCOLOR = Color.WHITE;
        panel = new JPanel();
        panel.setFocusable(true);
        panel.setLayout(null);
        panel.setBackground(BGCOLOR);


        /*
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,100,100);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100,100,100,100);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150,150,100,100);

        JLayeredPane rectangles = new JLayeredPane();
        rectangles.setBounds(0,0,400,400);
        rectangles.add(label1, Integer.valueOf(0));
        rectangles.add(label2, Integer.valueOf(2));
        rectangles.add(label3, Integer.valueOf(1));
                 */

        frame = new JFrame();
        frame.setTitle("BABY GAME");
        frame.setSize(400, 600);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setContentPane(panel);

        //frame.add(rectangles);
/*
        ImageIcon image = new ImageIcon("pool-party.jpg");
        JLabel label = new JLabel();
        label.setText("Hello Baby !");
        label.setIcon(image);
        label.setForeground(Color.GREEN);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        panel.add(label);
        */


        createBaby(BGCOLOR);
        createBlocks(BGCOLOR);
        createGouttes(BGCOLOR);
        createBonbons(BGCOLOR);



    }

    public void launch() {
        this.frame.setVisible(true);
    }

    private void createBaby(Color color) {
        baby = new Baby(color);
        this.panel.add(baby.getPanel());
        this.panel.addKeyListener(new GameKeyListener(baby, this));
    }

    public void deployUmbrella(int X, int Y) {
        this.umbrella = new Umbrella(BGCOLOR, X, Y);
        this.panel.add(umbrella.getPanel());
        this.panel.repaint();
        //disparition au bout de une seconde par ex.
        timer = new Timer(1000,this);
        timer.start();
    }

    public void removeUmbrella() {
        this.panel.remove(this.umbrella.getPanel());
        this.panel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.removeUmbrella();
        this.panel.repaint();
    }







    private void createBlocks(Color color) {
        JPanel panel1 = new JPanel();
        panel1.setBounds(5, 5, 40, 40);
        panel1.setLayout(null);
        ajouterCoins(panel1, color, 5);
        panel1.setBackground(Color.DARK_GRAY);
        this.panel.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBounds(100, 5, 40, 40);
        panel2.setLayout(null);
        ajouterCoins(panel2, color, 5);
        panel2.setBackground(Color.DARK_GRAY);
        this.panel.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setBounds(340, 5, 40, 40);
        panel3.setLayout(null);
        ajouterCoins(panel3, color, 5);
        panel3.setBackground(Color.DARK_GRAY);
        this.panel.add(panel3);
    }

    private void createGouttes(Color color) {
        JPanel panel1 = new JPanel();
        panel1.setBounds(60, 5, 25, 35);
        panel1.setLayout(null);
        ajouterCoins(panel1, color, 5);
        panel1.setBackground(Color.BLUE);
        this.panel.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBounds(240, 5, 25, 35);
        panel2.setLayout(null);
        ajouterCoins(panel2, color, 5);
        panel2.setBackground(Color.BLUE);
        this.panel.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setBounds(200, 5, 25, 35);
        panel3.setLayout(null);
        ajouterCoins(panel3, color, 5);
        panel3.setBackground(Color.BLUE);
        this.panel.add(panel3);
    }

    private void createBonbons(Color color) {
        JPanel panel1 = new JPanel();
        panel1.setBounds(150, 5, 35, 35);
        panel1.setLayout(null);
        ajouterCoins(panel1, color, 5);
        panel1.setBackground(Color.MAGENTA);
        this.panel.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBounds(280, 5, 35, 35);
        panel2.setLayout(null);
        ajouterCoins(panel2, color, 5);
        panel2.setBackground(Color.MAGENTA);
        this.panel.add(panel2);
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


}
