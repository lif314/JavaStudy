import java.time.LocalDate;
import java.util.Objects;

public class EmployeeTest {
    public static void main(String[] args) {  // main方法是静态方法--- 调用方法不需要对象
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Hello", 75000, 1978, 12, 14);  // always with new
        staff[1] = new Employee("World", 80000, 1999, 1, 4);
        staff[2] = new Employee("Kittd", 45434, 1994, 5, 6);

        var harry = new Employee("God", 232243, 2000, 12, 12); // just fit in local variable
        System.out.println("name=" + harry.getName() + ", salary=" + harry.getSalary() + ", hireDay=" + harry.getHireDay());

        var boss = new Employee("Boss", 12131, 2001, 3, 4);
        if(harry.equals(boss))
            System.out.println("Harry is the boss!");

        // raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }
    }
}


// define a class
class Employee
{
    // fields
    //private final String firstName; 
    /**
     * final:不可变字段，在构造对象时必须进行初始化，且不能被更改，且final不能修饰可变的类，如StringBuilder
     */

    /**
     * 静态字段： static -- 每个类只有这样一个字段，对象没有，所有实例共享一个静态字段 
     * private static int nextId = 1;
     */

    /**
     * 静态常量
     *  public static final double PI = 3.14159;
     */

    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructors
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n; // Error: String name = s;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // null problem
    /**
     * Employee e = null;
     * e.getName(); -----> NullPointerException
     * 2 Methods:
     */
    // first
    public Employee(String n, double s)
    {

        name = (n == null)? "unknown" : n; // Error: String name = s;
        salary = s;
    }

    // second
    public Employee(String n)
    {
        name = Objects.requireNonNullElse(n, "unlnown");
        // Objects.requireNonNull(n, "The name cannot be null.");
        // name = n;
    }

    // Mothods

    /**
     * 静态方法：不在对象上执行的方法，eg Math.pow(x,a);
     * 可以访问静态字段
     * public static int getNextId()
     * {
     *      return nextId; 
     * }
     */

    /**
     * static: 属于类而不属于任意类对象的变量和函数
     */

     /**
      * 工厂方法(factory method):静态方法， eg: LocateDate.now()
      * @return
      */
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * implicit argv
     */
    public void raiseSalaryImplicit(double byPercent)
    {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public boolean equals(Employee other)
    {
        return name.equals(other.name);
    }
}