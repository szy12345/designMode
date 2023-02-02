package observer;

/**
 * 抽象事件父类
 */
public abstract class PetEvent {
    private Pet source;

    public PetEvent(){}

    public PetEvent(Pet source){
        this.source = source;
    }

    public Pet getSource() {
        return source;
    }
}
