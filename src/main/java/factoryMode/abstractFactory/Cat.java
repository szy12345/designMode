package factoryMode.abstractFactory;

import factoryMode.simpleFactory.Pleasurable;

/**
 * 猫类
 */
public class Cat extends PleasuableThing {
    public void please() {
        System.out.println("喵喵喵。。。。。");
    }
}
