import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestReverse {
    private static Sentence testSentence;
    private static MainReverse mainReverse;

    @BeforeAll
    public static void setUp() {
        mainReverse = new MainReverse();
        testSentence = new Sentence("test sentence java");
    }

    @Test
    public void correctSentenceTest() {
        Assertions.assertEquals("test sentence java", testSentence.getWords());
        testSentence.setWords("correct sentence");
        Assertions.assertNotNull(testSentence);
        Assertions.assertEquals("correct sentence", testSentence.getWords());
    }

    @Test
    public void correctReverseTest() {
        testSentence.setWords("correct Reverse");
        Assertions.assertEquals("tcerroc esreveR ", mainReverse.reverse(testSentence));
    }

    @ParameterizedTest
    @MethodSource("wordsError")
    public void incorrectSentenceTest(String words) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            testSentence.setWords(words);
        });
    }
    static Stream<String> wordsError() {
        return Stream.of(null, "", " ");
    }
}
