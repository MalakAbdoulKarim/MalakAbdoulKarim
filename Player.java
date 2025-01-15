public class Player {
    private String name = "";
    private int score = 0;
    public void setName(String newName) {
        this.name = newName;
    }
    public void setScore(int newScore) {
        this.score = newScore;
    }
    public String getName() {
        return this.name;
    }
    public int getScore() {
        return this.score;
    }
}
