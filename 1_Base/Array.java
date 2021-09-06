import java.util.Arrays;

/**
 * 数组
 */
public class Array {
    public static void main(String[] args) {
       int[] a;   // 声明数组
       a = new int[10]; // 初始化数组 --- 初始全为0
       System.out.println(Arrays.toString(a));

       int[] b = new int[10];
       System.out.println(Arrays.toString(b));
    
       // 数组长度不要求是常量
       int n = 10;
       int[] c = new int[n];
       System.out.println(Arrays.toString(c));

       // 数组创建后长度不能再改变 ----> 数组列表(array list)

       // 赋初值
       int[] smallPrimes = {2,3,5,7,11,13,17};

       // 数组后加,可不断增加值
       String[] names = {
           "hello",
           "Kitty",
           "wod",
       };
       System.out.println(Arrays.toString(names));

       // 声明匿名数组
       a = new int[] { 1, 2, 3, 4 }; // 重新初始化而无需再创建新的变量

       // 等价于
       int[] annoymous = {1,2,3,4,4};
       b = annoymous;


       // 长度为0的数组 --- 与null不同
       int[] hello = new int[0]; // 返回值的数组中没有元素
       System.out.println(Arrays.toString(hello));

       /**
        * 访问数组元素
        */
        // 数字数组初始全为0； boolean数组初始全为false; 对象数组为null，如String
        for(int i = 0; i < smallPrimes.length; i++)
            System.out.println(smallPrimes[i]);


        // for each ： 逐一处理元素而无需下标
        for (int i : b) {
            System.out.println(i);
            i *= 12;
            System.out.println(i);
        }


        // 快速访问元素值
        System.out.println(Arrays.toString(annoymous));


        /**
         * 数组拷贝：两个变量引用同一个数组
         */

         int[] luckyNumbers = smallPrimes;
         luckyNumbers[4] = 12; // 此时smallPrimes[4] = 12 !!!!!!
         
         
         // 拷贝所有值
         int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);

         // 通常用来增加数组长度
        int[] copiedLuckyNumbers2 = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);

        System.out.println(Arrays.toString(copiedLuckyNumbers));
        System.out.println(Arrays.toString(copiedLuckyNumbers2));
    }
}
