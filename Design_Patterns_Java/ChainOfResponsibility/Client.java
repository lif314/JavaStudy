package Design_Patterns_Java.ChainOfResponsibility;

import Design_Patterns_Java.ChainOfResponsibility.ConcreteHandler.ConcreteHandler1;
import Design_Patterns_Java.ChainOfResponsibility.ConcreteHandler.ConcreteHandler2;
import Design_Patterns_Java.ChainOfResponsibility.Framework.Request;
import Design_Patterns_Java.ChainOfResponsibility.Framework.Response;
import Design_Patterns_Java.ChainOfResponsibility.Handler.Handler;

public class Client {
    public static void main(String[] args) {
        // 声明所有的处理结点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        // 设置链中处理顺序
        handler1.setNext(handler2);

        // 提交请求，返回结果
        Response response = handler1.handlerMessage(new Request());

        System.out.println(response);
    }
}