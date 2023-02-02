package observer;

/**
 * 猫
 */
public class Cat extends Pet{
    public Cat(String name, Integer appetite) {
        this.species = "dog";
        this.name = name;
        this.appetite = appetite;
        this.getObservers().add(new WeakUpEventListener());
    }
    @Override
    public void call() {
        System.out.println("喵。。。喵。。。喵。。。");
        WeakUpEvent event = new WeakUpEvent(this);
        for (PetObserver listener : this.getObservers()) {
            listener.action(event);
        }
    }
}
