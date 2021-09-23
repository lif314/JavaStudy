package Design_Patterns_Java.Command;

import Design_Patterns_Java.Command.Command.Command;
import Design_Patterns_Java.Command.Command.ConcreteCommand1;
// import Design_Patterns_Java.Command.Receiver.ConcreteReceiver1;
// import Design_Patterns_Java.Command.Receiver.Receiver;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        // 声明调用者类Invoker
        Invoker invoker = new Invoker();

        // 定义接受者  ---  封装Receiver
        // Receiver receiver = new ConcreteReceiver1();

        // 定义一个发送给接受者的命令
        Command command = new ConcreteCommand1();

        // 把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}