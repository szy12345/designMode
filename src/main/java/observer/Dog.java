package observer;

/**
 * 狗
 */
public class Dog extends Pet{
    public Dog() {}
    public Dog(String name, Integer appetite) {
        this.species = "dog";
        this.name = name;
        this.appetite = appetite;
    }
    @Override
    public void call() {
        System.out.println("汪。。。汪。。。汪。。。");
    }
}
