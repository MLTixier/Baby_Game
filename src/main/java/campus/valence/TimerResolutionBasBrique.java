package campus.valence;

import java.util.Timer;
import java.util.TimerTask;

public class TimerResolutionBasBrique {

    public TimerResolutionBasBrique(Game game) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new BasBrique(game), 0, 1000);
    }

    public static class BasBrique extends TimerTask {

        private Game game;

        public BasBrique(Game game) {
            this.game = game;
        }

        @Override
        public void run() {
            game.resolutionBriqueBas();
        }
    }

}
