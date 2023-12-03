// Parent Class
public class Shape {
    String color;
    boolean filled;

    // Regular Constuctor
    Shape(){
    }

    // Parameterized Constuctor
    Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // Getting The Color
    String getColor(){
        return this.color;
    }

    // Changing The Color
    void setColor(String newColor){
        this.color = newColor;
    }

    // Checking if it's Filled
    boolean isFilled(){
        return this.filled;
    }

    // Setting The Filled State
    void setFilled(boolean newState){
        this.filled = newState;
    }

    // Overriding The toString() built in Function
    @Override
    public String toString(){
        String filled;
        if(this.isFilled()){
            filled = "Filled";
        }else{filled = "not Filled";}
        return "the Shape is " + this.color + " and " + filled;
    }
    public static void main(String[] args){
        //Testing The Shape() Methods
        Shape shape1 = new Shape("red", true);
        System.out.println("the color of the shape is: " + shape1.getColor());
        shape1.setColor("Green");
        System.out.println("the new color of the shape is: " + shape1.getColor());
        if(shape1.isFilled()){
            System.out.println("the shape is filled");
        }else{System.out.println("the shape is not filled");}
        System.out.println(shape1.toString());

        // Testing The Circle() Methods
        Circle circle1 = new Circle("yellow", false, 5.2);
        System.out.println("the circle's radius is: " + circle1.getRadius());
        circle1.setRadius(4.2);
        System.out.println("the new Radius is: " + circle1.getRadius());
        System.out.println(circle1.toString());

        // Testing The Rectangle() Class
        Rectangle rectangle1 = new Rectangle("blue", true, 5.2, 2.4);
        System.out.println("the rectangle's width is: "+ rectangle1.getWidth());
        rectangle1.setWidth(63.2);
        System.out.println("the new width of the rectangle is: "+rectangle1.getWidth());
        System.out.println("the rectangle's length is: " + rectangle1.getLength());
        rectangle1.setLength(2.1);
        System.out.println("the new length of the rectangle is: " + rectangle1.getLength());
        System.out.println(rectangle1.toString());
    }
}

// Child Class
class Circle extends Shape{
    double radius;
    Circle(){}
    Circle(String color, boolean filled , double radius){
        // Using super Method to Construct color and filled by The Parent Class
        super(color,filled);
        this.radius = radius; 
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double newRadius){
        this.radius = newRadius;
    }
    @Override
    public String toString(){
        String state;
        if(this.isFilled()){
            state = "Filled";
        }else{state = "not Filled";}
        return "this circle is " + this.color + " and " + state + " and its radius is " + this.radius;
    }
}
class Rectangle extends Shape{
    double width, length;
    Rectangle(){}
    Rectangle(String color ,boolean filled, double width,double length){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    double getWidth(){
        return this.width;
    }
    double getLength(){
        return this.length;
    }
    void setWidth(double width){
        this.width = width;
    }
    void setLength(double newLength){
        this.length = newLength;
    }
    @Override
    public String toString(){
        String temp;
        if(this.isFilled()){
            temp = "Filled";
        }else{temp = "not Filled";}
        return "this rectangle is " + this.color + " and " + temp + ", its width is: " + this.width + " and its length is: " + this.length;
    }
}