package Design_Patterns_Java.Proxy;

import Design_Patterns_Java.Proxy.RealSubject.RealSubject;
import Design_Patterns_Java.Proxy.Proxy.Proxy;

public class Client {
    public static void main(String[] args) {
        // 客户端应用
        RealSubject realSubject = new RealSubject();

        Proxy proxy = new Proxy(realSubject); // Subject

        // 代理执行
        proxy.request();
    }
    
}
