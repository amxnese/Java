import java.lang.Math;
import java.util.Scanner;
public class Shape {
  private int numSides;
  private float area;

  Shape(int numSides){
    this.numSides = numSides;
  }

  int getNumSides(){
    return this.numSides;
  }

  float getArea(){
    return this.area;
  }

  double calc_area(){
    return 0;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int shape;
    double area;
    System.out.println("enter the shape that you need:  ");
    shape = scanner.nextInt();
    if(shape == 1){
      Circle circle1 = new Circle(0, 3.4);
      area = circle1.calc_area();
      System.out.println("the area of the circle is: "+ area);
    }
    else if(shape == 2){
      Rectangle rect1 = new Rectangle(4, 6,7);
      area = rect1.calc_area();
      System.out.println("the area of the rectangle is: "+ area);
    }
    else if(shape == 3){
      Square square1 = new Square(4, 5);
      area = square1.calc_area();
      System.out.println("the area of the square is: "+ area);
    }
    else{System.out.println("invalid input");}
  }
}

class Circle extends Shape{
  private double radius;

  Circle(int numSides ,double radius){
    super(numSides);
    this.radius = radius;
  }

  @Override
  public double calc_area(){
    return Math.PI * Math.pow(radius, 2) ;
  }
}

class Rectangle extends Shape{
  private double width;
  private double length;

  Rectangle(int numSides ,double width,double length){
    super(numSides);
    this.width = width;
    this.length = length;
  }

  @Override
  public double calc_area(){
    return length * width;
  }
}

class Square extends Shape{
  private double side;

  Square(int numSides ,double side){
    super(numSides);
    this.side = side;
  }

  @Override
  public double calc_area(){
    return Math.pow(side, 2);
  }
}