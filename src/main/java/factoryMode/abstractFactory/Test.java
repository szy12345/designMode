package factoryMode.abstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


public class Test {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            InputStream inputStream = new FileInputStream("src/main/resources/config.properties");
            properties.load(inputStream);
            String FactoryClassName = properties.getProperty("petFactoryClass");
            Class clazz = Class.forName(FactoryClassName);
            Method createFactoryMethod = clazz.getDeclaredMethod("create");
            PleasurableFactory factory = (PleasurableFactory)createFactoryMethod.invoke(null);
            PleasuableThing pleasuableThing = factory.getPleasuableThing();
            pleasuableThing.please();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("sgk");
    }
}
