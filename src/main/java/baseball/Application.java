package baseball;

import baseball.config.DependencyInjector;
import baseball.controller.GameController;

public class Application {
    public static void main(String[] args) {
        DependencyInjector dependencyInjector = new DependencyInjector();
        GameController controller = dependencyInjector.createGameController();

        controller.run();
    }
}
