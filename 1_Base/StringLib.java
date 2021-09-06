// java 字符串

public class StringLib {
    public static void main(String[] args) {
        String str = "Hello Java!";
        // 字串
        String substr = str.substring(0,3);
        
        // 拼接
        String addstr = str + substr;

        //  多个拼接 + 界定符
        String allstr = String.join(" / ", str, substr, addstr);

        // java 11 repeat
        String repeated = allstr.repeat(3);

        // java字符串是不可变的，不能直接在后面新添加字符  --- 编译器可以让不可变字符串共享
        // eg: str ----> "Hello Java! ? !"
        // 先提取字串，再拼接
        str = str.substring(0, -1) + " ? !";

        // 检测字符串是否相等  --- 不能用 ==
        boolean equals = str.equals(repeated);

        // 不区分大小写
        boolean equalsIgnoreCase = str.equalsIgnoreCase(repeated);

        // == 表示两个字符串是否存放在同一个位置

        // 空串与 Null串
        if(str.length() == 0){  // if(str.equals(""))
            System.out.println(equalsIgnoreCase + " " + " " + equals);
        }

        if(str != null && str.length() != 0) // 应该先检查 null
            ;
    }
}
