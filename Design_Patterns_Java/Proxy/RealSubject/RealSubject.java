package Design_Patterns_Java.Proxy.RealSubject;

import Design_Patterns_Java.Proxy.Subject.Subject;

public class RealSubject implements Subject {
    // 实现方法
    public void request(){
        // 业务实现
        System.out.println("RealSubject.request() !");
    }
}
