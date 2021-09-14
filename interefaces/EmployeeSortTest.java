package interefaces;

import java.util.Arrays;

/**
 * This program demonstrates the use of the Comparable interface.
 */

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Hello", 739932);
        staff[1] = new Employee("Kitty", 42432);
        staff[2] = new Employee("Tony", 31212);

        Arrays.sort(staff);  // Employee class can call sort() method

        // print out information about all employee objects
        for (Employee e: staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }    
}