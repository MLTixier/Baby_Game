package campus.valence;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDescenteBriques {

    public TimerDescenteBriques(Game game) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new DescenteBriques(game), 0, 100);
    }

    public static class DescenteBriques extends TimerTask {

        private Game game;

        public DescenteBriques(Game game) {
            this.game = game;
        }

        @Override
        public void run() {
            game.descenteBriques(10);
        }
    }

}
