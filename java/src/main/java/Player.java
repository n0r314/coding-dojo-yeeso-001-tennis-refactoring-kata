// public record Player(String name, int score) {

//     Player wonPoint() {
//         return new Player(this.name, this.score + 1);
//     }

// }


public class Player {
    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void wonPoint() {
        this.score++;
    }
}