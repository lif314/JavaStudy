package abstractClasses;

public class Student extends Person{
    private String major;

    /**
     * @param name the student's name
     * @param major the student's major
     */
    
     public Student(String n, String m)
     {
         // pass name to superclass constructor
         super(n);
         major = m;
     }

    public String getDescription()
    {
        return "a student majoring in " + major;
    }
}