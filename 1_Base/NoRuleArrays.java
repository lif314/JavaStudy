public class NoRuleArrays {
    public static void main(String[] args) {
        // 多维数组 --- 数组的数组
        double[][] balance = new double[10][10];

        // 交换行
        double[] temp = balance[2];
        balance[3] = balance[2];
        balance[2] = temp;

        // 创建下三角矩阵 --- 第i行有i+1个元素
        final int NMAX = 10;
        int [][] odds = new int[NMAX + 1][];

        // assign
        for(int n = 0; n < odds.length; n++)
            odds[n] = new int[n+1];

        // access
        for(int i = 0; i < odds.length; i++)
            for(int j = 0; j < odds[i].length; j++)
                odds[i][j] = i + 1;
    }
}