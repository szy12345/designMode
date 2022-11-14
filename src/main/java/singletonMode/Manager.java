package singletonMode;

/**
 * 饿汉式
 */
public class Manager {
    private static Manager instance;
    private Manager(){}

    static {
        instance = new Manager();
    }
    public static Manager getInstance(){
        if(instance == null){
            try {
                Thread.sleep(100);
                instance = new Manager();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}
