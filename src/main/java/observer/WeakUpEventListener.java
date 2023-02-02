package observer;

/**
 * 醒来事件的监听者
 */
public class WeakUpEventListener implements PetObserver{
    @Override
    public void action(PetEvent event) {
        Pet eventSource = event.getSource();
        if (eventSource instanceof Cat){
            System.out.println("发财，不要吵");
        }

    }
}
