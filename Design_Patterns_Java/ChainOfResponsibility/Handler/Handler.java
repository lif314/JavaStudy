package Design_Patterns_Java.ChainOfResponsibility.Handler;

import Design_Patterns_Java.ChainOfResponsibility.Framework.Level;
import Design_Patterns_Java.ChainOfResponsibility.Framework.Request;
import Design_Patterns_Java.ChainOfResponsibility.Framework.Response;

/**
 * 抽象处理者
 */
public abstract class Handler {
    private Handler nextHandler;

    // 每个处理者都必须对请求作出处理
    public final Response handlerMessage(Request request) {
        
        Response response = null;

        // 判断自己的处理级别
        if(this.getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else{ // 不属于自己的处理级别
            if(this.nextHandler != null){
                response = this.nextHandler.handlerMessage(request);
            }else{
                // 没有适当的处理者，自行处理
            }
        }

        return response;
    }
    
    // 设置下一个处理者是谁
    public void setNext(Handler _handler){
        this.nextHandler = _handler;
    }

    // 每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    // 每个处理者都必须实现处理业务
    protected abstract Response echo(Request request);
}