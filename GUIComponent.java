abstract interface GUIComponent {
public abstract void onClick(int a);
public abstract void onCursorFocus(int a);
public abstract boolean move(int a, int b);
public abstract boolean move(Position a);
public abstract boolean move(Dimension a);
public abstract boolean resize(int a, int b);
}
