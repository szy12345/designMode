package factoryMode.abstractFactory;

import factoryMode.simpleFactory.Pleasurable;

/**
 * 狗类
 */
public class Dog extends PleasuableThing {
    public void please() {
        System.out.println("汪汪汪。。。。。");
    }
}
