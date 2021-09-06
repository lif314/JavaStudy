/**
 * This program demonstrates static methods.
 * java Employee
 * java StaticTest
 */
public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        var staff = new Employee[3];

        staff[0] = new Employee("Tom", 23444);
        staff[1] = new Employee("Hello", 1131);
        staff[2] = new Employee("Hie", 1213);

        // print out information about all Employee objects
        for (Employee e : staff) {
            e.setId();   // create id
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", id=" + e.getId());
        }
        

        int n = Employee.getNextId();  // static methods
        System.out.println("Next available id =" + n);
    }
}


/**
 * Employee class
 */

 class Employee
 {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public  String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id = nextId; // set id to the next available id
        nextId++;
    }

    public static int getNextId()
    {
        return nextId;  // return static field
    }

    public static void main(String[] args)  // unit test
    {
        var e = new Employee("harry", 2444);
        System.out.println(e.getName() + " " + e.getSalary());
    }
 }