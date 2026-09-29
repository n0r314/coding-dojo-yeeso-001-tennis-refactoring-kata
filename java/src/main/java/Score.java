public enum Score {
    ZERO("Zéro", 0), 
    QUINZE("Quinze", 1), 
    TRENTE("Trente", 2), 
    QUARANTE("Quarante", 3);

    private final String name;
    private final int point;

    Score(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return this.name;
    }

    public static Score fromPoint(int point) {
        for (Score score : Score.values()) {
            if (score.point == point) {
                return score;
            }
        }
        throw new IllegalStateException("Allowed point values are: 0, 1, 2, 3");
    }
}