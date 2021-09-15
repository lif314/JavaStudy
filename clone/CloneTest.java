package clone;

/**
 * This prigram demonsrates cloning
 */

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        var original = new Employee("John", 10000);

        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();  // clone

        copy.raiseSalary(100000);
        copy.setHireDay(2010, 10, 1);
        
        System.out.println("Original=" + original);
        System.out.println("copy=" + copy);
    }
}
