package factoryMode.simpleFactory;

/**
 * 猫厂
 */
public class CatFactory extends PleasurableFactory {
    public CatFactory() {
    }

    @Override
    public Cat creat() {
        System.out.println("log--a cat created");
        return new Cat();
    }

}
