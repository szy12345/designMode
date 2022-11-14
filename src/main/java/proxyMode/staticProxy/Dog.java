package proxyMode.staticProxy;


public class Dog implements Action{
    private String name;
    private  Integer appetite;

    public Dog() {
    }

    public Dog(String name, Integer appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    @Override
    public void bark() {
        System.out.println("我是一只狗，我叫"+this.name+"，我想吃饭，要吃"+this.appetite+"才饱");
    }

    @Override
    public void eat() {
        System.out.println("我是"+this.name+"，我在吃饭");
    }
}
