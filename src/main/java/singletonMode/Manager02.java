package singletonMode;

/**
 * 懒汉式+锁
 */
public class Manager02 {
    private Manager02(){};

    private static Manager02 instance;

    public static Manager02 getInstance(){
        synchronized (Manager02.class){
            try {
                Thread.sleep(100);
                if(null == instance){
                    instance = new Manager02();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return instance;

    }
}
