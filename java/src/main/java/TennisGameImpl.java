
public class TennisGameImpl implements TennisGame {
    
    private int p2;
    private int p1;
    private String p1N;
    private String p2N;

    public TennisGameImpl(String p1N, String p2N) {
        this.p1N = p1N;
        this.p2N = p2N;
    }

    public String getScore() {
        String s;
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            String[] p = new String[]{"Zéro", "Quinze", "Trente", "Quarante"}; 
            s = p[p1];
            return s + "-" + p[p2];
        } else {
            if (p1 == p2)
                return "Égalité";
            s = p1 > p2 ? p1N : p2N;
            return ((p1-p2)*(p1-p2) == 1) ? "Avantage " + s : "Jeu " + s;
        }
    }
    
    public void wonPoint(String playerName) {
        if (playerName == "joueur1")
            this.p1 += 1;
        else
            this.p2 += 1;
        
    }

}
