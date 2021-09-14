package abstractClasses;

/**
 * This program demonstrates abstract classes
 */

public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];

        // fill the people array with student and Employee objects
        people[0] = new Employee("Hello Kity", 29722, 1999, 3, 12);
        people[1] = new Student("Stu Hai", "computer science");

        // print out names and description of all Person objects
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}