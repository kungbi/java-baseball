package baseball.domain;

import baseball.exception.AnswerNumberDuplicateException;
import baseball.exception.AnswerNumberSizeException;
import baseball.exception.NullOrBlankException;
import java.util.List;

public class AnswerNumbers {
    private final List<Integer> numbers;

    public AnswerNumbers(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new NullOrBlankException();
        }
        if (numbers.size() != 3) {
            throw new AnswerNumberSizeException();
        }
        if (numbers.stream().distinct().count() != numbers.size()) {
            throw new AnswerNumberDuplicateException();
        }
        this.numbers = numbers;
    }
}
