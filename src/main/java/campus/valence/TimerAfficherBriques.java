package campus.valence;

import java.util.Timer;
import java.util.TimerTask;

public class TimerAfficherBriques {

    public TimerAfficherBriques(Game game) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new AffichageBriques(game), 0, 100);
    }

    public static class AffichageBriques extends TimerTask {

        private Game game;

        public AffichageBriques(Game game) {
            this.game = game;
        }

        @Override
        public void run() {
           game.afficherBriques();
        }
    }

}
