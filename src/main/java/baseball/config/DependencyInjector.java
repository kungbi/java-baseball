package baseball.config;

import baseball.controller.GameController;
import baseball.domain.AnswerNumbers;
import baseball.service.GameService;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class DependencyInjector {
    public GameController createGameController() {
        AnswerNumbers answerNumbers = createAnswerNumbers();
        GameService gameService = new GameService(answerNumbers);

        return new GameController(gameService);
    }

    private static AnswerNumbers createAnswerNumbers() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(Config.MIN_RANDOM_NUMBER.getInt(),
                Config.MAX_RANDOM_NUMBER.getInt(), Config.NUMBER_OF_RANDOM_NUMBER.getInt());
        return new AnswerNumbers(numbers);
    }
}
