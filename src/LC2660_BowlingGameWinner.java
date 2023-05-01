public class LC2660_BowlingGameWinner {
    public int isWinner(int[] player1, int[] player2) {

        int player1Score = 0;
        int player2Score = 0;
        for (int i = 0; i < player1.length; i++) {
            player1Score += shotWorth(player1, i);
            player2Score += shotWorth(player2, i);
        }

        if (player1Score > player2Score) {
            return 1;
        } else if (player2Score > player1Score) {
            return 2;
        } else return 0;
    }

    private int shotWorth(int[] player, int i) {
        int factor = 1;
        if (i == 1 && player[0] == 10) {
            factor = 2;
        } else if (i > 1 && (player[i - 1] == 10 || player[i - 2] == 10)) {
            factor = 2;
        }

        return player[i] * factor;
    }
}
