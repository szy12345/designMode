package proxyMode.cglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 *
 * cglib动态代理测试类
 */
public class Test {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Cat.class);
        enhancer.setCallback(new MyInterceptor());
        Cat cat = (Cat)enhancer.create();
        cat.eat();
    }
}
