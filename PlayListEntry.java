public class PlayListEntry {
    private String title = "";
    private String artist = "";
    private int playCount = 0;
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public void setArtist(String newArtist) {
        this.artist = newArtist;
    }
    public void setPlayCount(int newPlayCount) {
        this.playCount = newPlayCount;
    }
    public String getTitle() {
        return this.title;
    }
    public String getArtist() {
        return this.artist;
    }
    public int getPlayCount() {
        return this.playCount;
    }
}
