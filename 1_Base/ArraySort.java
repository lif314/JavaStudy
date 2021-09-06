import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = {12, 3435,6,567 ,68,87,798,9,8,9,0,454,4545,466,4556,7,4};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);   // Quick Sort
        System.out.println(Arrays.toString(a));
    }
}
