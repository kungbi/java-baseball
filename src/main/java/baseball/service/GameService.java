package baseball.service;

import baseball.domain.AnswerNumbers;
import baseball.dto.SubmitAnswerDto.SubmitAnswerInputDto;
import baseball.dto.SubmitAnswerDto.SubmitAnswerOutputDto;

public class GameService {
    private final AnswerNumbers answerNumbers;

    public GameService(AnswerNumbers answerNumbers) {
        this.answerNumbers = answerNumbers;
    }

    public SubmitAnswerOutputDto submitAnswer(SubmitAnswerInputDto inputDto) {
        return new SubmitAnswerOutputDto(answerNumbers.calculateScore(inputDto.numbers()));
    }
}
