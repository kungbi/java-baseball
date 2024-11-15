package baseball.domain;

import baseball.config.Score;
import baseball.exception.AnswerNumberDuplicateException;
import baseball.exception.AnswerNumberRangeException;
import baseball.exception.AnswerNumberSizeException;
import baseball.exception.NullOrBlankException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        if (numbers.stream().anyMatch(number -> !(1 <= number && number <= 9))) {
            throw new AnswerNumberRangeException();
        }
        this.numbers = numbers;
    }


    public Map<Score, Integer> calculateScore(List<Integer> userNumbers) {
        Map<Score, Integer> score = new HashMap<>();
        for (Score scoreType : Score.values()) {
            score.put(scoreType, 0);
        }

        for (int i = 0; i < userNumbers.size(); i++) {
            if (isStrike(i, userNumbers.get(i))) {
                score.put(Score.STRIKE, score.get(Score.STRIKE) + 1);
                continue;
            }
            if (isBall((userNumbers.get(i)))) {
                score.put(Score.BALL, score.get(Score.BALL) + 1);
                continue;
            }
            score.put(Score.NOTHING, score.get(Score.NOTHING) + 1);
        }
        return score;
    }

    private boolean isStrike(int index, int number) {
        return numbers.get(index) == number;
    }

    private boolean isBall(int number) {
        return numbers.contains(number);
    }
}
