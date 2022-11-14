package proxyMode.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        testBark(new Cat("波妞",5));
    }

    private static void testBark(Action actor) {
        getActorProxy(actor).bark();
    }

    private static Action getActorProxy(Object action){
        //类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        //被代理类被调用的方法的处理程序
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(action,args);
            }
        };
        //需要实现的接口
        Class<?>[] interFaces = action.getClass().getInterfaces();
        Action actorProxy = (Action)Proxy.newProxyInstance(classLoader,interFaces,invocationHandler);
        return actorProxy;
    }
}
