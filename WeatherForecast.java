 class WeatherForecast {
    private String skies = "";
    private int high = 0;
    private int low = 0;
    public void setSkies(String newSkies) {
        this.skies = newSkies;
    }
    public void setHigh(int newHigh) {
        this.high = newHigh;
    }
    public void setLow(int newLow) {
        this.low = newLow;
    }
    public String getSkies() {
        return this.skies;
    }
    public int getHigh() {
        return this.high;
    }
    public int getLow() {
        return this.low;
    }
}
