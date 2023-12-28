import java.util.Scanner;

public class Person1 {
    private String name;
    private int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInformation(){
        System.out.println("Person's Name: " + this.name);
        System.out.println("Person's Age: " + this.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // double[] herGrades = {12.5,8,7,14,15.5};
        Student student1 = new Student("jane" , 19);
        student1.setGrades();
        double grades[] = student1.getGrades();
        for(int i=0; i<5; i++){
            System.out.println("Grade of Module No " + (i+1) + " = " + grades[i]);
        }
        System.out.println("the avg = " + student1.calculateAverageGrade());
        System.out.println("************************************************");
        student1.displayInformation();

        Teacher teacher1 = new Teacher("abdelheq ", 23, "POO");
        teacher1.displayInformation();
    }
}

class Student extends Person1{
    private double[] grades = {0.0,0.0,0.0,0.0,0.0};
    
    // Constuctor 1
    Student(String name, int age, double[] grades) {
        super(name, age);
        for (int i=0 ; i < 5; i++){
            this.grades[i] = grades[i];
        }
    }

    // Constuctor 2
    Student(String name, int age) {
        super(name, age);
    }

    public double[] getGrades() {
        return grades;
    }

    public double calculateAverageGrade(){
        double sum = 0.0;
        for(int i=0;i<5; i++){
            sum += this.grades[i];
        }
        double avg = sum/5;
        return avg;
    }

    public void setGrades() {
        try (Scanner scanner = new Scanner(System.in)) {
          for (int i=0 ; i < 5; i++){
              System.out.print("Enter The Grade For Module No " + (i+1) + ": ");
              this.grades[i] = scanner.nextDouble();
          }
        }
    }

    @Override
    public void displayInformation(){
        System.out.println("the name of the person " + super.getName());
        System.out.println("His age : " + super.getAge());
        System.out.println("the grade in the module 1 is : " + this.grades[0]);
        System.out.println("the grade in the module 2 is : " + this.grades[1]);
        System.out.println("the grade in the module 3 is : " + this.grades[2]);
        System.out.println("the grade in the module 4 is : " + this.grades[3]);
        System.out.println("the grade in the module 5 is : " + this.grades[4]);
        System.out.println("avg : " + this.calculateAverageGrade());
    }
}

class Teacher extends Person1{
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayInformation(){
        System.out.println("Teacher's Name: " + this.getName());
        System.out.println("Teacher's Age: " + this.getAge());
        System.out.println("a Teacher of: " + this.subject);
    }
}