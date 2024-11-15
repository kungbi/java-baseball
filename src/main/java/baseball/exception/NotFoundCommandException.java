package baseball.exception;

public class NotFoundCommandException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = IllegalArgumentMessage.NOT_FOUND_COMMAND.getMessage();

    public NotFoundCommandException() {
        super(DEFAULT_MESSAGE);
    }

    public NotFoundCommandException(String s) {
        super(s);
    }
}
