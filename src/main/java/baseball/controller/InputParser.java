package baseball.controller;

import java.util.ArrayList;
import java.util.List;

public class InputParser {

    public static int parseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("문자를 입력할 수 없습니다.", e);
        }
    }

    public static List<Integer> parseIntList(String input) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            list.add(parseInt(input.substring(i, i + 1)));
        }

        return list;
    }

}
