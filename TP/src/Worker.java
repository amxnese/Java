public class Worker {
    private String name;
    private int ID;

    Worker(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void perform(){
        System.out.println("Doing a generic task ... ");
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public static void main(String[] args) {
        SalariedEmployee ahmed = new SalariedEmployee("Ahmed",62,"crazy 8", 800);
        System.out.println(ahmed.monthlyPaid(36));
        ahmed.information();
        ahmed.perform();

        System.out.println("**********************************************");
        HourlyEmployee aymen = new HourlyEmployee("Aymen", 54, "T bag",20,12.3);
        System.out.println(aymen.weeklyPay());
        aymen.information();
        aymen.perform();

        System.out.println("**************************************************");
        aymen.setHoursWorked(19);
        System.out.println(aymen.weeklyPay());
        aymen.information();
        aymen.perform();
    }
}

class Employee extends Worker{
    private String jobTitle;

    Employee(String name, int ID, String jobTitle) {
        super(name, ID);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void information(){
        System.out.print("Employee " + getName());
        System.out.print(" With The ID " + getID());
        System.out.println(" AKA '" + getJobTitle() + "'");
    }
}

class HourlyEmployee extends Employee{
    private int hoursWorked;
    private double  hourlyRate;

    HourlyEmployee(String name, int ID, String jobTitle, int hoursWorked, double hourlyRate) {
        super(name, ID, jobTitle);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double weeklyPay(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public void information(){
        System.out.print("Employee " + getName());
        System.out.print(" With The ID " + getID());
        System.out.println(" AKA '" + getJobTitle() + "'");
        System.out.println("hourly rate : $" + this.hourlyRate);
        System.out.println("hours Worked : " + this.hoursWorked + "Hours");
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(String name, int ID, String jobTitle, double salary) {
        super(name, ID, jobTitle);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double monthlyPaid(int numberTasks){
        return salary + (numberTasks * (getSalary() * 0.002));
    }

    @Override
    public void information(){
        System.out.print("Employee " + getName());
        System.out.print(" With The ID " + getID());
        System.out.println(" AKA '" + getJobTitle() + "'");
        System.out.println("his salary : " + getSalary());
    }
}