public class AlphaChannelColor extends Color {
private int alpha;
public AlphaChannelColor(int r, int g, int b, int a) {
super(r,g,b);
alpha = a;
}
public int getAlpha(){
return alpha;
}
}
