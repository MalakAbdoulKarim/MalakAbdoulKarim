public class CameraPhone extends Phone {
private int imageSize;
private int memorySize;
public CameraPhone(int im, int me) {
imageSize = im;
memorySize = me;
}
public int numPictures() {
return memorySize * 1000 / imageSize;
}
}
