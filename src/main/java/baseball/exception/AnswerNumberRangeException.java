package baseball.exception;

public class AnswerNumberRangeException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = IllegalArgumentMessage.ANSWER_NUMBER_RANGE.getMessage();

    public AnswerNumberRangeException() {
        super(DEFAULT_MESSAGE);
    }

    public AnswerNumberRangeException(String s) {
        super(s);
    }
}
