package Inheritance;

public class Manager extends Employee {
    private double bonus;

    /**
     * @param name the employee's name
     * @param salary the employee's salary
     * @param year the employee's year
     * @param month the employee's month
     * @param day the employee's day
     */

    // child class cnstructor
     public Manager(String n, double s, int year, int month, int day){
         super(n, s, year, month, day);
         bonus = 0;
     }

     public double getSalary(){
         double baseSalary = super.getSalary() + bonus;  // child call super class's method
         return baseSalary;
     }

     public void setBonus(double b){
         bonus = b;
     }
}
