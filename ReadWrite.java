public class ReadWrite extends ReadOnly {
private boolean modified;
public ReadWrite(int arg) {
super(arg);
modified = false;
}
public void setVal(int arg) {
val = arg;
modified = true;
}
public boolean isDirty() {
return modified;
}
}
