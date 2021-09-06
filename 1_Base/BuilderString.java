public class BuilderString {
    public static void main(String[] args) {
        // 构建字符串
        StringBuilder builder = new StringBuilder();
        String ch = "Hello";
        String str = "World";
        builder.append(str);
        builder.append(ch);
        builder.insert(1, str);
        builder.insert(4, 'a');
        builder.delete(3, 4);
        
        System.out.println(builder.length());

        // to String
        String completedString = builder.toString();

        System.out.println(completedString);
    }
}
