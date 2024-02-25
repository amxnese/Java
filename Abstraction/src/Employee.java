abstract class Employee {
  abstract float calculateSalary();
  abstract void displayInfo();
  public static void main(String[] args) {
    Manager manager = new Manager("corona", 6000, 1000);
    Programmer Programmer = new Programmer("antal", 5000, 20, 25);
    manager.displayInfo();
    Programmer.displayInfo();
  }
}

class Manager extends Employee{
  String name;
  float salary;
  float bonus;

  Manager(String name, float salary, float bonus){
    this.name = name;
    this.salary = salary;
    this.bonus = bonus;
  }

  float calculateSalary(){
    return this.salary + this.bonus;
  }

  void displayInfo(){
    System.out.println("Manager Name : " + this.name + 
    "\nManager Salary : " + this.salary +
    "\nBonus : " + this.bonus +
    "\nTotal Salary : " + this.calculateSalary());
  }
}

class Programmer extends Employee{
  String name;
  float salary;
  int overtime;
  float hourlyRate;
  Programmer(String name, float salary, int overtime, float hourlyRate){
    this.name = name;
    this.salary = salary;
    this.overtime = overtime;
    this.hourlyRate = hourlyRate;
  }

  float calculateSalary(){
    return this.salary + (hourlyRate * overtime);
  }

  void displayInfo(){
    System.out.println("Programer Name : " + this.name + 
    "\nBase Salary : " + this.salary +
    "\nOvertime : " + this.overtime +
    "\nHourly Rate : " + this.hourlyRate + 
    "\nTotal Salary : " + this.calculateSalary());
  }
}
