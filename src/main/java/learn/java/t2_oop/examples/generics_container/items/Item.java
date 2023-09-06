package learn.java.t2_oop.examples.generics_container.items;

public abstract class Item {
    private int width;
    private int height;
    private int length;

    public Item(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() { return width; }

    public int getHeight() { return height; }

    public int getLength() { return length; }

    public long getSquare(){
        return (long) getWidth() * getHeight() * getLength();
    }
}
