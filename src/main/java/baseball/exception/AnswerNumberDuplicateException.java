package baseball.exception;

public class AnswerNumberDuplicateException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = IllegalArgumentMessage.ANSWER_NUMBER_DUPLICATE.getMessage();

    public AnswerNumberDuplicateException() {
        super(DEFAULT_MESSAGE);
    }

    public AnswerNumberDuplicateException(String s) {
        super(s);
    }
}
