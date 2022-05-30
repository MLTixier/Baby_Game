package campus.valence;

import java.util.Timer;
import java.util.TimerTask;

public class TimerAddBrique {

    public TimerAddBrique(Game game) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new AjouterBrique(game), 0, 2000);
    }

    public static class AjouterBrique extends TimerTask {

        private Game game;

        public AjouterBrique(Game game) {
            this.game = game;
        }

        @Override
        public void run() {
            game.creationBriqueHaut();
        }
    }

}
