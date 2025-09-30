package Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton_lazy obj1=Singleton_lazy.getInstance();
        Singleton_lazy obj2=Singleton_lazy.getInstance();
        System.out.println(obj1==obj2);

        Singleton_Eager eager1=Singleton_Eager.getInstance();
        Singleton_Eager eager2=Singleton_Eager.getInstance();
        System.out.println(eager1==eager2);

        Singleton_Sync sync1=Singleton_Sync.getInstance();
        Singleton_Sync sync2=Singleton_Sync.getInstance();
        System.out.println(sync1==sync2);

        Singleton_DoubleCheck dc=Singleton_DoubleCheck.getInstance();
        Singleton_DoubleCheck dc1=Singleton_DoubleCheck.getInstance();
        System.out.println(dc==dc1);

    }
}
