package equals;

public class Manager extends Employee{
    private double bonus;

    public Manager(String n, double s, int year, int month, int day)
    {
        super(n, s, year, month, day);
        bonus =  0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b)
    {
        this.bonus = b;
    }

    public boolean equals(Object otherObject)
    {
        if(!super.equals(otherObject))  //  same class ?
            return false;

        var other = (Manager) otherObject;
        // super.equals checked that this and other belong to the same class
        return bonus == other.bonus;
    }


    public int hasCode()
    {
        return java.util.Objects.hash(super.hasCode(), bonus);
    }

    public String toString()
    {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}