package Design_Patterns_Java.Command.Receiver;

public class ConcreteReceiver2 extends Receiver{
    // 每个接收者都必须处理一定的业务逻辑
    public void doSomething(){
        System.out.println("ConcreteReceiver2 doSomething() !");
    }
}