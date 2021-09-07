package Inheritance;

/**
 * This program demonstrates inheritance
 */

public class ManagerTest {
    public static void main(String[] args) {
        // coustruct a Manager object
        var boss = new Manager("Carl", 80000, 2021, 9, 6);
        boss.setBonus(5000);

        var staff = new Employee[3];

        // fill the staff array with Manager and Emplyee objects
        staff[0] = boss;  // Empployee <----- Manager   === substitution principle
        staff[1] = new Employee("Ali", 58329, 1999, 6, 13);
        staff[2] = new Employee("Ace", 23234, 1997, 12, 13);

        // print out iinformation about all Employee objects
        // e can call Manager's method and Employee's methods  -- polymorphism --- dynamic binding
        for (Employee e : staff) {  
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}











