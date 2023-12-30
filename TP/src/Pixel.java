public class Pixel {
  private int x;
  private int y;

  // Parametrized Constructor
  Pixel(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Getters and Setters for x and y
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}

class ColoredPixel extends Pixel {
  private int[] color; // RGB color array

  // Constructor for ColoredPixel
  public ColoredPixel(int x, int y, int[] color) {
    super(x, y);
    this.color = color;
  }

  // Getter and Setter for color
  public int[] getColor() {
    return color;
  }

  public void setColor(int[] color) {
    this.color = color;
  }
}

class Segment {
  private ColoredPixel pixel1;
  private ColoredPixel pixel2;

  // Constructor for Segment
  Segment(ColoredPixel pixel1, ColoredPixel pixel2) {
    this.pixel1 = pixel1;
    this.pixel2 = pixel2;
  }

  // Getters and Setters for pixel1 and pixel2
  public ColoredPixel getPixel1() {
    return pixel1;
  }

  public void setPixel1(ColoredPixel npixel1) {
    this.pixel1 = npixel1;
  }

  public ColoredPixel getPixel2() {
    return pixel2;
  }

  public void setPixel2(ColoredPixel npixel2) {
    this.pixel2 = npixel2;
  }
}

class Rectangle extends Segment {
  private ColoredPixel pixel3;
  private ColoredPixel pixel4;

  Rectangle(ColoredPixel pixel1, ColoredPixel pixel2, ColoredPixel pixel3, ColoredPixel pixel4) {
    super(pixel1, pixel2);
    this.pixel3= pixel3 ;
    this.pixel4= pixel4 ;
}
}

class Rectangle1 {
  private Segment segment1;
  private Segment segment2;

// Constructor using composition
  Rectangle1(Segment segment1, Segment segment2) {
    this.segment1 = segment1;
    this.segment2 = segment2;
  }

  public Segment getSegment1() {
    return segment1;
  }

  public void setSegment1(Segment segment1) {
    this.segment1 = segment1;
  }

  public Segment getSegment2() {
    return segment2;
  }

  public void setSegment2(Segment segment2) {
    this.segment2 = segment2;
  }
}
