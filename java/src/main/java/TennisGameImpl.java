
public class TennisGameImpl implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGameImpl(String player1, String player2) {
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
    }

    public String getScore() {
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        if (score1 < 4 && score2 < 4 && !(score1 + score2 == 6)) {
            return Score.fromPoint(score1).getName() + "-" + Score.fromPoint(score2).getName();
        } 
        return isEquality(score1, score2);
    }
    
    public void wonPoint(String playerName) {
        if (playerName == player1.getName())
            player1.wonPoint();
        else
            player2.wonPoint();
    }

    private String isEquality(int score1, int score2) {
        if (score1 == score2) {
            return "Égalité";
        }
        String winningName = score1 > score2 ? player1.getName() : player2.getName();
        return ((score1-score2)*(score1-score2) == 1) ? "Avantage " + winningName : "Jeu " + winningName; 
    }
}
