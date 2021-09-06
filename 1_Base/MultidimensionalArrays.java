import java.util.Arrays;

/**
 * 多维数组
 */

 public class MultidimensionalArrays{
     public static void main(String[] args) {
         double[][] balances; // 声明
         balances = new double[12][12]; // 初始化

         for(int i = 0; i < balances[0].length; i++)
            for(int j = 0; j < balances[i].length; j++)
                balances[i][j] = i * j;

        for(int i = 0; i < balances[0].length; i++)
            for(int j = 0; j < balances[i].length; j++)
                System.out.println(balances[i][j]);


        for (double[] row : balances) {    // 一行
            for (double value : row) {
                System.out.println(value);                
            }

        // 快速访问
        System.out.println(Arrays.deepToString(balances));
            
        }
     }
 }