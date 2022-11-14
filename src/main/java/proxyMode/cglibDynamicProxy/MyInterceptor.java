package proxyMode.cglibDynamicProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行代理类的方法开始");
        methodProxy.invokeSuper(o,objects);
        System.out.println("执行代理类的方法开始");
        return null;
    }
}
