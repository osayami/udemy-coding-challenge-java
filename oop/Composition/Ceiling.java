package Composition;

public class Ceiling {
    private int height, paintedColor;

    public Ceiling(int height, int paintedColor) {
        if (height <0) this.height=0; else this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

   

    public int getPaintedColor() {
        return paintedColor;
    }
}
