package factoryMode.abstractFactory;

public abstract class PleasurableFactory {
    public static PleasurableFactory create(){
        return null;
    }

    public abstract PleasuableThing getPleasuableThing();

}
