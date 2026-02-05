import java.io.Serializable;
public class Employee implements Serializable {
    
    private int id;
    private String name;
    private int salary;
    private int Experience;
    private int age;

    public Employee(int id, String name,int salary,int Experience,int age) {
        this.id = id;
        this.name = name;
        this.salary=salary;
        this.Experience=Experience;
        this.age=age;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Experience:"+Experience);
        System.out.println("Age:"+age);
    }
}