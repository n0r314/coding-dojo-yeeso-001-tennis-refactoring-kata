import org.junit.jupiter.params.ParameterizedTest;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.provider.MethodSource;

public class TennisTest {

    public static Stream<Object[]> getAllScores() {
        return Stream.of(new Object[][]{
                {0, 0, "Zéro-Zéro"},
                {1, 1, "Quinze-Quinze"},
                {2, 2, "Trente-Trente"},
                {3, 3, "Égalité"},
                {4, 4, "Égalité"},

                {1, 0, "Quinze-Zéro"},
                {0, 1, "Zéro-Quinze"},
                {2, 0, "Trente-Zéro"},
                {0, 2, "Zéro-Trente"},
                {3, 0, "Quarante-Zéro"},
                {0, 3, "Zéro-Quarante"},
                {4, 0, "Jeu joueur1"},
                {0, 4, "Jeu joueur2"},

                {2, 1, "Trente-Quinze"},
                {1, 2, "Quinze-Trente"},
                {3, 1, "Quarante-Quinze"},
                {1, 3, "Quinze-Quarante"},
                {4, 1, "Jeu joueur1"},
                {1, 4, "Jeu joueur2"},

                {3, 2, "Quarante-Trente"},
                {2, 3, "Trente-Quarante"},
                {4, 2, "Jeu joueur1"},
                {2, 4, "Jeu joueur2"},

                {4, 3, "Avantage joueur1"},
                {3, 4, "Avantage joueur2"},
                {5, 4, "Avantage joueur1"},
                {4, 5, "Avantage joueur2"},
                {15, 14, "Avantage joueur1"},
                {14, 15, "Avantage joueur2"},

                {6, 4, "Jeu joueur1"},
                {4, 6, "Jeu joueur2"},
                {16, 14, "Jeu joueur1"},
                {14, 16, "Jeu joueur2"},
        });
    }

    private static void checkAllScores(int player1Points, int player2Points, String expectedScore, TennisGame game) {
        int highestScore = Math.max(player1Points, player2Points);
        for (int i = 0; i < highestScore; i++) {
            if (i < player1Points)
                game.wonPoint("joueur1");
            if (i < player2Points)
                game.wonPoint("joueur2");
        }
        assertThat(game.getScore()).isEqualTo(expectedScore);
    }


    @ParameterizedTest
    @MethodSource("getAllScores")
    public void checkAllScoresTennisGameImpl(int player1Points, int player2Points, String expectedScore) {
        TennisGame game = new TennisGameImpl("joueur1", "joueur2");
        checkAllScores(player1Points, player2Points, expectedScore, game);
    }

 }