package arrayListTest;

import java.util.*;

/**
 * This program demonstrates the ArrayList class
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // fill the staff array list with three Employee Objects
        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Cracker", 50000, 1990, 3, 4));
        staff.add(new Employee("Tony Cracker", 60000, 1993, 7, 9));

        // raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay" + e.getHireDay());   
        }


        Employee kitty = new Employee("kitty", 20082, 2008, 12, 5);

        staff.set(1, kitty);

        
        Employee Hello = staff.get(1);
        System.out.println(Hello);  // method: ToString()


        staff.remove(1);  // remove an element from ArrayList
          // print out information about all Employee objects
          for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay" + e.getHireDay());   
        }

    }
}
