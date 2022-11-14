package factoryMode.abstractFactory;

public class CatFactory extends PleasurableFactory{
    private CatFactory(){}
    public static PleasurableFactory create(){
        return CatFactoryHolder.INSTANCE;
    }

    public Cat getPleasuableThing(){
        return new Cat();
    }

    static class CatFactoryHolder{
        private static PleasurableFactory INSTANCE = new CatFactory();
    }
}
