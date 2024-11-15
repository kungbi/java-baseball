package baseball.exception;

public class GameNumberDuplicateException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = IllegalArgumentMessage.ANSWER_NUMBER_DUPLICATE.getMessage();

    public GameNumberDuplicateException() {
        super(DEFAULT_MESSAGE);
    }

    public GameNumberDuplicateException(String s) {
        super(s);
    }
}
