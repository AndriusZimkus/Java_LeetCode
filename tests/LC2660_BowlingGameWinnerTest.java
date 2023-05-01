import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC2660_BowlingGameWinnerTest {

    LC2660_BowlingGameWinner lc2660_bowlingGameWinner = new LC2660_BowlingGameWinner();

    @Test
    void isWinner1() {
        int[] player1 = {4, 10, 7, 9};
        int[] player2 = {6, 5, 2, 3};

        int expected = 1;
        int actual = lc2660_bowlingGameWinner.isWinner(player1, player2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isWinner2() {
        int[] player1 = {3, 5, 7, 6};
        int[] player2 = {8, 10, 10, 2};

        int expected = 2;
        int actual = lc2660_bowlingGameWinner.isWinner(player1, player2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isWinner3() {
        int[] player1 = {2, 3};
        int[] player2 = {4, 1};

        int expected = 0;
        int actual = lc2660_bowlingGameWinner.isWinner(player1, player2);

        Assertions.assertEquals(expected, actual);
    }
}
