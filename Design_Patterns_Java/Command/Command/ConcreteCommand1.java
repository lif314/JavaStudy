package Design_Patterns_Java.Command.Command;

import Design_Patterns_Java.Command.Receiver.ConcreteReceiver1;
import Design_Patterns_Java.Command.Receiver.Receiver;

public class ConcreteCommand1 extends Command {
    // 对哪个Receiver类进行命令处理
    // private Receiver receiver;

    // 构造函数传递接收者
    // 声明默认接受者
    public ConcreteCommand1(){
        super(new ConcreteReceiver1());
    }

    // 设置新的接受者
    public ConcreteCommand1(Receiver _receiver){
        super(_receiver);
    }
    
    // 必须实现一个命令
    public void execute(){
        this.receiver.doSomething();
        System.out.println("ConcreteCommand1 execute()!");
    }
}