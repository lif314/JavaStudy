package abstractClasses;

/**
 * abstract class
 */

public abstract class Person {
    private String name;
    public abstract String getDescription();  // this is not required in super class
    
    public Person(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return name;
    }
}
