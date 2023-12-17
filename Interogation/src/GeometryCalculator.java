import java.lang.Math;
public class GeometryCalculator {
  private double num1;
  private double num2;

  GeometryCalculator(double num1,double num2){
    this.num1 = num1;
    this.num2 = num2;
  }

  double rect_area(){
    return this.num1 * this.num2;
  }

  double rect_perimeter(){
    return (this.num1 + this.num2) * 2;
  }

  double circle_area(double radius){
    return Math.PI * radius * radius;
  }

  double circle_perimeter(double radius){
    return 2 * Math.PI * radius;
  }
  public static void main(String[] args) {
    GeometryCalculator geo = new GeometryCalculator(2, 3);
    System.out.println(geo.circle_area(23));
    System.out.println(geo.circle_perimeter(23));

  }
  
}

class AdvancedGeometryCalculator extends GeometryCalculator{
  double radius;
  double height;

  AdvancedGeometryCalculator(double num1,double num2, double radius,double height){
    super(num1, num2);
    this.radius = radius;
    this.height = height;
  }

  double cylinder_vol(){
    return Math.PI *radius*radius*height;
  }

  double sphere_vol(){
    return 4/3 *Math.PI *radius*radius*radius;
  }
}
