package proxyMode.staticProxy;

public class Cat implements Action{
    /**
     *
     */
    private String name;
    private  Integer appetite;
    private Dog dog = new Dog("旺财",2);

    @Override
    public void bark() {
        dog.bark();
    }

    @Override
    public void eat() {
        dog.eat();
    }
}
