package Design_Patterns_Java.Command.Receiver;

public class ConcreteReceiver1 extends Receiver {
    // 每个接受者都必须处理一定的业务逻辑
    public void doSomething()
    {
        System.out.println("ConcreteReceiver1 doSomething() !");
    }
}