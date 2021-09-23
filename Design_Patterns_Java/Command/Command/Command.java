package Design_Patterns_Java.Command.Command;

import Design_Patterns_Java.Command.Receiver.Receiver;

/**
 * 抽象Command类
 */
public abstract class Command {
    // 定义一个子类的全局共享变量 ---  封装Receiver
    protected final Receiver receiver;
    
    // 实现类必须定义一个接收者
    public Command(Receiver _receiver){
        this.receiver = _receiver;
    }

    // 每个命令都应该必须有一个执行命令的方法
    public abstract void execute();
}