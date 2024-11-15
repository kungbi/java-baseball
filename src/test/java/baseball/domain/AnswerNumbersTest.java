package baseball.domain;

import baseball.config.Score;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AnswerNumbersTest {

    static Stream<Arguments> 점수_계산_테스트_케이스() {
        return Stream.of(
                Arguments.of(
                        List.of(1, 2, 3),
                        List.of(1, 2, 3),
                        List.of(3, 0, 0)
                ),
                Arguments.of(
                        List.of(1, 2, 3),
                        List.of(1, 2, 4),
                        List.of(2, 0, 1)
                ),
                Arguments.of(
                        List.of(1, 2, 3),
                        List.of(4, 5, 6),
                        List.of(0, 0, 3)
                ),
                Arguments.of(
                        List.of(1, 2, 3),
                        List.of(3, 2, 1),
                        List.of(1, 2, 0)
                ),
                Arguments.of(
                        List.of(1, 2, 3),
                        List.of(4, 5, 6),
                        List.of(0, 0, 3)
                )
        );
    }

    @Test
    void 정상__정담번호_생성() {
        // given
        List<Integer> numbers = List.of(1, 2, 3);

        // when
        AnswerNumbers answerNumbers = new AnswerNumbers(numbers);
    }

    @ParameterizedTest
    @MethodSource("점수_계산_테스트_케이스")
    void 정상__계산결과(List<Integer> answerNumbers, List<Integer> userNumber, List<Integer> expected) {
        // given
        AnswerNumbers answer = new AnswerNumbers(answerNumbers);

        // when
        Map<Score, Integer> score = answer.calculateScore(userNumber);

        // then
        Assertions.assertEquals(expected.get(0), score.get(Score.STRIKE));
        Assertions.assertEquals(expected.get(1), score.get(Score.BALL));
        Assertions.assertEquals(expected.get(2), score.get(Score.NOTHING));
    }

}