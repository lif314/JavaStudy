public class LoopString {
    public static void main(String[] args) {
         // 遍历字符串，并一次检查每一个码点
         String sentence = "I am Hello World!";
         for(int i = 0; i < sentence.length(); ){
             int cp = sentence.codePointAt(i);
             if(Character.isSupplementaryCodePoint(cp))
                i += 2;
            else
                i++;
         }

         // 反向遍历
         int k = sentence.length();
         k--;
         if(Character.isSurrogate(sentence.charAt(k))) k--;
         int cp1 = sentence.codePointAt(k);

         System.out.print(cp1);

         // 使用codePoints方法转换为数组
         int[] codePoints = sentence.codePoints().toArray();

         // 码点数组转换为字符串 -- 构造器
         String str = new String(codePoints, 0, codePoints.length);
         System.out.println(str);
    }
}
