package Design_Patterns_Java.Proxy.Proxy;

import Design_Patterns_Java.Proxy.Subject.Subject;


public class Proxy implements Subject{
    // 要代理哪个实现类
    private Subject subject = null;

    // 默认被代理者
    public Proxy(){
        this.subject = new Proxy();
    }

    // 通过构造函数传递代理者
    public Proxy(Object...objects){

    }

    // 由客户端决定的代理
    /**
     * 一个代理类可以代理多个被委托者或被代理者，因此一个代理类具体
     * 代理哪个真实对象，可以由客户端决定。
     * @param _subject 客户端代理对象
     */
    public Proxy(Subject _subject){
        this.subject = _subject;
    }

    // 实现接口中定义的方法
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    // 预处理
    public void before(){
        // do something
        System.out.println("Proxy.before() !");
    }


    // 善后处理
    public void after(){
        // do something
        System.out.println("Proxy.after() !");
    }
}