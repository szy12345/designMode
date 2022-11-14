package factoryMode.simpleFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 客户端测试类
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("来一个会取悦我的宠物");

        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream("src/main/resources/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String petFactoryClassName = properties.getProperty("petFactoryClass");
        PleasurableFactory pleasurableFactory = null;
        Pleasurable PleasurableThing = null;
        try {
            pleasurableFactory = (PleasurableFactory)Class.forName(petFactoryClassName).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        PleasurableThing = pleasurableFactory.creat();
        PleasurableThing.please();
    }
}
