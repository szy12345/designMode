package proxyMode.jdkDynamicProxy;

/**
 * 猫类
 */
public class Cat implements Action{
    private String name;
    private  Integer appetite;

    public Cat() {
    }

    public Cat(String name, Integer appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    @Override
    public void eat() {
        System.out.println("我是"+this.name+"，我在吃饭");
    }

    @Override
    public void bark() {
        System.out.println("我是一只猫，我叫"+this.name+"，我想吃饭，要吃"+this.appetite+"才饱");
    }
}
