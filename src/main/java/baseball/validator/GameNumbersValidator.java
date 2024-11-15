package baseball.validator;

import baseball.exception.GameNumberDuplicateException;
import baseball.exception.GameNumberRangeException;
import baseball.exception.GameNumberSizeException;
import baseball.exception.NullOrBlankException;
import java.util.List;

public class GameNumbersValidator {
    public static void validate(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new NullOrBlankException();
        }
        if (numbers.size() != 3) {
            throw new GameNumberSizeException();
        }
        if (numbers.stream().distinct().count() != numbers.size()) {
            throw new GameNumberDuplicateException();
        }
        if (numbers.stream().anyMatch(number -> !(1 <= number && number <= 9))) {
            throw new GameNumberRangeException();
        }
    }
}
