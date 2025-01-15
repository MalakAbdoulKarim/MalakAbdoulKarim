public class ParkingMeter{
	private int timeLeft=0;
	public boolean add(int num){
	if (num==25){
		timeLeft+=30;
		return true;
	}
	return false;
	}
	public void tick(){
		if (this.timeLeft>0)timeLeft--;
}
public boolean isExpired(){
return timeLeft==0;
}
}
