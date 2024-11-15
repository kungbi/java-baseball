package baseball.exception;

public class CustomIllegalArgumentException extends IllegalArgumentException {
    private static final String DEFAULT_MESSAGE = "Custom IllegalArgumentException";

    public CustomIllegalArgumentException() {
        super(DEFAULT_MESSAGE);
    }

    public CustomIllegalArgumentException(String s) {
        super(s);
    }
}
