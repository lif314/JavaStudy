import java.math.*;

public class BigData {
    public static void main(String[] args) {
        /**
         * java.Math: BigInteger  BigDecimal --- 可以处理任意长度数字序列的数值
         * BigInteger ： 任意精度的整数运算
         * BigDecimal ： 任意精度的浮点数运算
         */

         // valueOf():普通数值转换为大数
        BigInteger a = BigInteger.valueOf(100);
        System.out.println(a);

        // 字符串参数的构造器
        BigInteger strData = new BigInteger("4544448785155433333333333333333333335444444444444444444444444444449568623322645513313225336784");
        System.out.println(strData);

        // 常量
        System.out.println(BigInteger.ZERO);
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.TEN);
        System.out.println(BigInteger.TWO);

        // 处理大数方法：add multiply
        BigInteger add = a.add(strData);
        System.out.println(add);

        BigInteger mul = a.multiply(strData);
        System.out.println(mul);


        // 对于简单的数，必须先转换成相应的对象才能处理
        BigInteger divide = strData.divide(BigInteger.valueOf(232434));
        System.out.println(divide);
    }
}
