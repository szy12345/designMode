package singletonMode;

/**
 * 枚举写法
 * 既解决了线程同步，也防止了反序列化生成对象
 */
public enum Manager04 {
    INSTANCE;

    public void method01(){

    }

}
