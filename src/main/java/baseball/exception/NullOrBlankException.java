package baseball.exception;

public class NullOrBlankException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = IllegalArgumentMessage.NULL_OR_BLANK.getMessage();

    public NullOrBlankException() {
    }

    public NullOrBlankException(String s) {
        super(s);
    }
}
