package baseball.exception;

public class GameNumberRangeException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = IllegalArgumentMessage.ANSWER_NUMBER_RANGE.getMessage();

    public GameNumberRangeException() {
        super(DEFAULT_MESSAGE);
    }

    public GameNumberRangeException(String s) {
        super(s);
    }
}
