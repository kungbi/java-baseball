package baseball.controller;

import baseball.config.Score;
import baseball.dto.SubmitAnswerDto.SubmitAnswerInputDto;
import baseball.dto.SubmitAnswerDto.SubmitAnswerOutputDto;
import baseball.service.GameService;
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
        while (true) {
            if (this.startTurn()) {
                break;
            }
        }
    }

    private boolean startTurn() {
        List<Integer> userNumbers = RetryInputUtil.getUserNumbers();
        SubmitAnswerOutputDto submitAnswerOutputDto = this.gameService.submitAnswer(
                new SubmitAnswerInputDto(userNumbers));

        Map<Score, Integer> score = submitAnswerOutputDto.score();
        for (Map.Entry<Score, Integer> entry : score.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        if (score.get(Score.STRIKE) == 3) {
            return true;
        }
        return false;
    }
}
