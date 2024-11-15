package baseball.view;

import baseball.config.Config;
import baseball.config.Score;
import java.util.Map;

public class OutputView {

    public static void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.println();
    }

    public static void printResult(Map<Score, Integer> score) {
        int ballCount = score.get(Score.BALL);
        int strikeCount = score.get(Score.STRIKE);
        int nothingCount = score.get(Score.NOTHING);

        if (ballCount != 0) {
            System.out.printf("%d볼 ", ballCount);
        }
        if (strikeCount != 0) {
            System.out.printf("%d스트라이크", strikeCount);
        }
        if (nothingCount == Config.NUMBER_OF_RANDOM_NUMBER.getInt()) {
            System.out.println("낫싱");
        }
        System.out.println();
    }

    public static void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }


    public static void printError(String message) {
        System.out.println("[ERROR] " + message);
    }
}
