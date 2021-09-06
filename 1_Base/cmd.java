public class cmd {
    public static void main(String[] args) { // args[]中并不存储程序名，args[0]为第一个参数
        // args接受命令参数
        if (args.length == 0 || args[0].equals("-h"))
            System.out.println("Hello,");
        else if (args[0].equals("-g"))
            System.out.println("Goodbye,");
        
        // print the other command-line arguments
        for(int i = 1; i < args.length; i++)
        {
            System.out.println(" " + args[i]);
        }

        System.out.println("!");
    }
}
