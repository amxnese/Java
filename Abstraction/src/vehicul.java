abstract class vehicul {
  abstract String getModel();
  abstract String getColor();
  abstract float getPrice();
  public static void main(String[] args) {
    Car car = new Car("ford", "red", 29999);
    System.out.println(car.getModel());
    System.out.println(car.getColor());
    System.out.println(car.getPrice());
  }
}

class Car extends vehicul{
  String model;
  String color;
  float price;
  Car(String model, String color, float price){
    this.model = model;
    this.color = color;
    this.price = price;
  }
  String getModel(){
    return this.model;
  };
  String getColor(){
    return this.color;
  };
  float getPrice(){
    return this.price;
  };
}