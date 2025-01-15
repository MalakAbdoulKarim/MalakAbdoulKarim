 class ContestResult{
	private String winner="";
	private String secondPlace="";
	private String thirdPlace="";
	public void setWinner(String newWinner) {
        this.winner = newWinner;
    }

    public void setSecondPlace(String newSecondPlace) {
        this.secondPlace = newSecondPlace;
    }

    public void setThirdPlace(String newThirdPlace) {
        this.thirdPlace = newThirdPlace;
    }
	public  String getWinner(){
		return this.winner;
	}
	public String getSecondPlace(){
		return this.secondPlace;
	}
	public String getThirdPlace(){
		return this.thirdPlace;
	}
}
