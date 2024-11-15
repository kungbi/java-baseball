package baseball.exception;

public enum IllegalArgumentMessage implements ExceptionMessage {
    NULL_OR_BLANK("NULL 혹은 비어있는 값이 입력되었습니다."),
    ANSWER_NUMBER_SIZE("숫자의 개수가 3개이어야 합니다."),
    ANSWER_NUMBER_DUPLICATE("중복된 숫자가 존재합니다.");

    private final String message;

    IllegalArgumentMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
