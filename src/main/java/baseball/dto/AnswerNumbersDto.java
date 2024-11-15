package baseball.dto;

import java.util.List;

public record AnswerNumbersDto(List<Integer> numbers) {

    public static AnswerNumbersDto from(List<Integer> numbers) {
        return new AnswerNumbersDto(List.copyOf(numbers));
    }

}
