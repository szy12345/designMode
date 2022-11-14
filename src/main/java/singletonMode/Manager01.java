package singletonMode;

/**
 * 懒汉式
 */
public class Manager01 {
    private static Manager01 instance;
    private Manager01(){}

    public static Manager01 getInstance(){
        if(instance == null){
            try {
                Thread.sleep(100);
                instance = new Manager01();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}
