public enum Level {

    //difficulty based on int (1 easy, 2 medium, 3 hard)
    Easy(1),
    Medium(2),
    Hard(3);

    private int difficulty;

    private Level(int difficulty){
        this.difficulty = difficulty;
    }
}
