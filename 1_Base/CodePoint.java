/**
 * Java字符串是由char值序列组成的
 * char数据类型是一个采用UTF-16编码表示的Unicode码点的代码单元
 * 一般情况一个字符用一个代码单元就可以表示
 */

public class CodePoint {
    public static void main(String[] args) {
        // 码点和代码单元
        String greeting = "Hello";
        int len = greeting.length(); // 5  --- UTF-16编码表示给定字符串所需要的代码单元数量
        System.out.print(len);

        int cpCount = greeting.codePointCount(0, greeting.length() - 1); // 实际长度，码点的数量
        System.out.println(cpCount);
        
        char first = greeting.charAt(0); // f: 代码单元
        System.out.print(first);

        // g获取第i个码点
        int i = 4;
        int index = greeting.offsetByCodePoints(0, i);
        int cp = greeting.codePointAt(index);
        System.out.print(cp);
    }
}
