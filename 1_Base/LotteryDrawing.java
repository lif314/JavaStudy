import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates array manipulation.
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        in.close();

        // fill an array with numbers 1, 2,3 4, ...
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++)
            numbers[i] = i + 1;
        
        // draw k numbers and put them into second array
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            // make a random index between 0 and n-1
            int r = (int)(Math.random() * n);   // random()  === 0-1

            // pick the element at the random location
            result[i] = numbers[r];

            // move the last element into the random location
            numbers[r] = numbers[n-1];
            n--;
        }

        // print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich! ");
        for (int i : result) {
            System.out.println(i);
        }

    }
}
