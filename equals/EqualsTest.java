package equals;

/**
 * This program demonstrates the equals method
 */
public class EqualsTest {
    public static void main(String[] args) {
        var alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var alice2 =  alice1;
        var alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var bob = new Employee("Bob", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString()" + bob); // auto call bob.toString()

        var carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);

        boss.setBonus(5000);

        System.out.println("boss.toString():"  + boss);
        System.out.println("carl.equals(boss):" + carl.equals(boss));

        System.out.println("alice1.hasCode():" + alice1.hasCode());
        System.out.println("alice3.hasCode():" + alice3.hasCode());
        System.out.println("bob.hasCode():" + bob.hasCode());
        System.out.println("carl.hasCode():" + carl.hasCode());
    }
}
