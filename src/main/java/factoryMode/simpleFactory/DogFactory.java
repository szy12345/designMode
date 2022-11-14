package factoryMode.simpleFactory;

/**
 * 狗厂
 */
public class DogFactory {
    private DogFactory() {
    }

    public Dog creat() {
        System.out.println("log--a dog created");
        return new Dog();
    }

    public DogFactory getInstance() {
        return DogFactoryHolder.INSTANCE;
    }

    /**
     * 静态内部类实现单例，利用JVM加载类只加载一次的特性保证线程同步
     */
    static class DogFactoryHolder {
        private static DogFactory INSTANCE = new DogFactory();
    }
}
