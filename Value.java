public class Value { 
	private boolean modified = false; private int val;
	public Value (int val) {
		this.val = val;
		}
public int getVal() {
return val;
}
public void setVal(int val) {
this.val = val;
modified = true;
}
public boolean wasModified() {
if (modified == true) {
return true;
}
else
return false;
}
}
