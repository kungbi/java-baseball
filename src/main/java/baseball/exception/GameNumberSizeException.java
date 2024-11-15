package baseball.exception;

public class GameNumberSizeException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = IllegalArgumentMessage.ANSWER_NUMBER_SIZE.getMessage();

    public GameNumberSizeException() {
        super(DEFAULT_MESSAGE);
    }

    public GameNumberSizeException(String s) {
        super(s);
    }
}
