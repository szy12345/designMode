package singletonMode;

/**
 * 静态内部类中创建实例
 */
public class Manager03 {
    private Manager03(){}

    public static Manager03 getInstance(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Manager03Holder.instance;
    }

    private static class Manager03Holder{
        private static Manager03 instance = new Manager03();
    }
}
