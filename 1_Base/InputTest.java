import java.util.Scanner;  // Scanner类

public class InputTest {
    public static void main(String[] args) {
        // 构造与标准输入流System.in关联的Scanner对象
        Scanner in = new Scanner(System.in);

        // 使用Scanner方法进行读取
        System.out.println("What is your name?");
        String name = in.nextLine(); // 读取一行输入
        System.out.println("Input a char: ");
        String aChar = in.next(); // 读取一个单词（空白符为分隔符）

        System.out.println("How old are you?");
        int age = in.nextInt(); // 读取一个整数

        System.out.println("input a float:");
        double dou = in.nextDouble();

        in.close();

        // display output on console
        System.out.println("Hello " + name + " aChar: " +  aChar + " age: " + age + " double: " + dou);
    }
}