package campus.valence;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener {

    private Baby baby;
    private Game game;

    public GameKeyListener(Baby baby, Game game) {
        this.baby = baby;
        this.game = game;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 37) {
            baby.moveLeft();
        } else if (keyEvent.getKeyCode() == 38) {
            game.deployUmbrella(baby.getPanel().getX()-17, baby.getPanel().getY() - 100);
        } else if (keyEvent.getKeyCode() == 39) {
            baby.moveRight();
        }

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

}
