public class Person {
    private String FirstName;
    private String LastName;

    Person(){}

    Person(String FirstName,String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    String getFirstName(){
        return this.FirstName;
    }

    String getLastName(){
        return this.LastName;
    }
    public static void main(String[] args){
        Person person1 = new Person("james","bond");
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());

        Employee employee1 = new Employee("david","gogginz",1234,"Cracker");
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.getLastName());
        System.out.println(employee1.getId());
    }
}

class Employee extends Person{
    private int Id;
    private String jobName;

    Employee(){}

    Employee(String FirstName,String LastName,int Id,String jobName){
        super(FirstName,LastName);
        this.Id = Id;
        this.jobName = jobName;
    }

    int getId(){
        return this.Id;
    }

    @Override
    String getLastName(){
        return super.getLastName() +" aka " + this.jobName;
    }
}