package baseball.controller;

import baseball.validator.CommandValidator;
import baseball.validator.GameNumbersValidator;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class RetryInputUtil {


    public static List<Integer> getUserNumbers() {
        return retryLogics(InputView::getUserNumbers, InputParser::parseIntList, GameNumbersValidator::validate);
    }

    public static int getCommand() {
        return retryLogics(InputView::getCommand, InputParser::parseInt, CommandValidator::validate);
    }

    private static <T> T retryLogics(Supplier<String> userInputReader, Function<String, T> parser,
                                     Consumer<T> validator) {
        while (true) {
            try {
                String userInput = userInputReader.get();
                T parsedInput = parser.apply(userInput);
                validator.accept(parsedInput);
                return parsedInput;
            } catch (IllegalArgumentException error) {
                OutputView.printError(error.getMessage());
            }
        }
    }
}
