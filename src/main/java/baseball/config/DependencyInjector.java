package baseball.config;

import baseball.controller.GameController;
import baseball.domain.AnswerNumbers;
import baseball.service.GameService;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class DependencyInjector {
    public GameController createGameController() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        GameService gameService = new GameService(new AnswerNumbers(numbers));
        return new GameController(gameService);
    }
}
