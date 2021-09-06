import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        // read inputs 
        Scanner in = new Scanner(System.in);

        System.out.print("How mush money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        in.close();

        double balance = 0;
        int year = 0;

        // uppdate account balance while goal isn't reached
        while(balance < goal)
        {
            // add this year's paymet and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
        }
        

        System.out.println("You can retire in " + year + " years.");
    }
}