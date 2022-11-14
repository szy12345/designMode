package proxyMode.cglibDynamicProxy;

/**
 * 猫类
 */
public class Cat {
    private String name;
    private  Integer appetite;

    public Cat() {
    }

    public Cat(String name, Integer appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat() {
        System.out.println("我是"+this.name+"，我在吃饭");
    }

    public void bark() {
        System.out.println("我是一只猫，我叫"+this.name+"，我想吃饭，要吃"+this.appetite+"才饱");
    }
}
