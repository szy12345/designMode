package singletonMode;

public class FactoryTest {
    public static void main(String[] args) throws Exception{

        for(int i = 0; i< 100;i++){
            new Thread(()->{
//                    System.out.println(Manager.getInstance());
//                    System.out.println(Manager01.getInstance());
//                System.out.println(Manager02.getInstance());
//                System.out.println(Manager03.getInstance());
                System.out.println(Manager04.INSTANCE.hashCode());

            }).start();
        }
    }
}
