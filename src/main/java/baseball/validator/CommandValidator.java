package baseball.validator;

import baseball.exception.NotFoundCommandException;

public class CommandValidator {
    public static void validate(int command) {
        if (command != 1 && command != 2) {
            throw new NotFoundCommandException();
        }
    }
}
