package baseball.dto;

import baseball.config.Score;
import java.util.List;
import java.util.Map;

public class SubmitAnswerDto {
    public record SubmitAnswerInputDto(List<Integer> numbers) {

    }

    public record SubmitAnswerOutputDto(Map<Score, Integer> score) {
    }
}
