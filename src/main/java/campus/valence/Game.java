package campus.valence;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;

public class Game implements ActionListener {

    private Color BGCOLOR;
    private JFrame frame;
    private JPanel panel;
    private Baby baby;
    private Umbrella umbrella;
    private int points ;
    private ArrayList<Brique> briques ;

    Game() {
        this.BGCOLOR = Color.WHITE;
        panel = new JPanel();
        panel.setFocusable(true);
        panel.setLayout(null);
        panel.setBackground(BGCOLOR);

        frame = new JFrame();
        frame.setTitle("BABY GAME");
        frame.setSize(400, 600);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setContentPane(panel);

        points = 0 ;
        createBaby(BGCOLOR);
        briques = new ArrayList<Brique>();
        new TimerResolutionBasBrique(this);
        new TimerDescenteBriques(this);
        new TimerAddBrique(this);
        new TimerAfficherBriques(this);
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
        Timer t2 = new Timer(1000, this); //après l'action sur une key, la méthode actionPerformed (supprimer le parapluie) est exécutée après 1sc
        t2.start();
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

    public void resolutionBriqueBas(){
        for (int i = 0 ; i<briques.size() ; i++){
           if (briques.get(i).getY()>400){
               briques.remove(i);
           }
        }
    }

    public void descenteBriques(int deltaY){
        for (Brique brique : briques){
            brique.descendre(deltaY);
        }
    }

    public void creationBriqueHaut(){
        Random rand = new Random();
        int i = rand.nextInt(3) ; //renvoie un entier entre 0 et 2
        int x = rand.nextInt(400-5+1) + 5; //renvoie un entier entre 5 et 400
        Brique panelBrique ;
        if (i == 0){
            panelBrique = new Block(BGCOLOR,x,5);
        } else if (i==1){
            panelBrique = new Bonbon(BGCOLOR,x,5);
        } else {
            panelBrique = new Goutte(BGCOLOR,x,5);
        }
        this.briques.add(panelBrique);
    }

    public void afficherBriques(){
        panel.removeAll();
        panel.add(baby.getPanel());
        for (Brique brique : briques){
            this.panel.add(brique.getPanelBrique());
        }
        this.panel.repaint();
    }



    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void addBrique(Brique brique) {
        this.briques.add(brique);
    }

}
