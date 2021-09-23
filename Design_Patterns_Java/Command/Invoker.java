package Design_Patterns_Java.Command;

import Design_Patterns_Java.Command.Command.Command;

/**
 * 调用者Invoker类
 */
public class Invoker {
    private Command command;

    // 接受命令
    public void setCommand(Command _command){
        this.command = _command;
    }

    // 执行命令
    public void action(){
        this.command.execute();
    }
}