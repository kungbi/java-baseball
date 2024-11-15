package baseball.controller;

import baseball.config.Score;
import baseball.dto.SubmitAnswerDto.SubmitAnswerInputDto;
import baseball.dto.SubmitAnswerDto.SubmitAnswerOutputDto;
import baseball.service.GameService;
import baseball.view.OutputView;
import java.util.List;
import java.util.Map;

public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    public void run() {
        do {
            this.startGame();
        } while (RetryInputUtil.getCommand() != 2);
    }

    private void startGame() {
        OutputView.printStartMessage();
        while (true) {
            if (this.startTurn()) {
                break;
            }
        }
        OutputView.printEndMessage();
    }

    private boolean startTurn() {
        try {
            List<Integer> userNumbers = RetryInputUtil.getUserNumbers();
            SubmitAnswerOutputDto submitAnswerOutputDto = this.gameService.submitAnswer(
                    new SubmitAnswerInputDto(userNumbers));

            Map<Score, Integer> score = submitAnswerOutputDto.score();
            OutputView.printResult(score);

            return score.get(Score.STRIKE) == 3;

        } catch (IllegalArgumentException error) {
            OutputView.printError(error.getMessage());
            return false;
        }
    }
}