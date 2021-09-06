public class Constants {

    // 类常量：static final 标识
    public static final double PI_OUT = 3.1415926535;  // 定义在main外部，同一个类中其他方法可以使用 
    public static void main(String[] args)
    {
        final double PI_IN = 3.14159;  // 关键字 final 指示常量，只能被赋值一次
        double r = 12;
        System.out.println("Area(r = 12) = " + PI_IN * r * r);
    }
}
