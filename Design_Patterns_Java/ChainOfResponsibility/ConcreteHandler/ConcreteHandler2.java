package Design_Patterns_Java.ChainOfResponsibility.ConcreteHandler;

import Design_Patterns_Java.ChainOfResponsibility.Framework.Level;
import Design_Patterns_Java.ChainOfResponsibility.Framework.Request;
import Design_Patterns_Java.ChainOfResponsibility.Framework.Response;
import Design_Patterns_Java.ChainOfResponsibility.Handler.Handler;

public class ConcreteHandler2 extends Handler{

    @Override
    protected Level getHandlerLevel() {
        // 设置自己的处理级别
        return null;
    }

    @Override
    protected Response echo(Request request) {
        // 完成处理逻辑
        return null;
    }      
}