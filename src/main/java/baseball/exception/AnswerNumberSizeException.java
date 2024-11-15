package baseball.exception;

public class AnswerNumberSizeException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = IllegalArgumentMessage.ANSWER_NUMBER_SIZE.getMessage();

    public AnswerNumberSizeException() {
        super(DEFAULT_MESSAGE);
    }

    public AnswerNumberSizeException(String s) {
        super(s);
    }
}
