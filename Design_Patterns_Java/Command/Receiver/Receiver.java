package Design_Patterns_Java.Command.Receiver;

/**
 * 通用Receiver类
 */
public abstract class Receiver {
    // 抽象类接受者，定义每个接受者都必须完成的业务
    // 抽象? --- 可以有多个接受者
    public abstract void doSomething();
}
