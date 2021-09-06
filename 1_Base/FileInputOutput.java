import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        // 读取文件，需要构造Scanner对象
        // Scanner in = new Scanner(Path.of("D:\\AllFile\\LearningFile\\JavaStudy\\1_Base\\myfile.txt"), StandardCharsets.UTF_8); // 这个Path方法一直出错emmmmmm,具体原因似乎与版本有关
        String filePath = "D:\\AllFile\\LearningFile\\JavaStudy\\1_Base\\myfile.txt"; // 绝对路径
        Scanner fromFile = null;
        System.out.println("The  file " + filePath + " contains the following lines:");

        try{
            fromFile = new Scanner(new File(filePath));
        }catch(FileNotFoundException e){
            // e.printStackTrace();
            System.out.println("Error opening the file " + filePath);
            System.exit(0);
        }

        while(fromFile.hasNextLine()){
            String line = fromFile.nextLine();  // 逐行读取文件
            System.out.println(line);
        }

        fromFile.close();  // 关闭文件



        // 写入文件，需要构造PrintWriter对象
        PrintWriter out = new PrintWriter("./1_Base/myfile.txt", StandardCharsets.UTF_8);
        System.out.println("Enter your passwd to the file:");
        Scanner in = new Scanner(System.in);
        String passwd = in.nextLine();
        in.close();
        out.write(passwd);  // 两者都是覆盖写入
        // out.append(passwd);
        out.close();
    }
}
