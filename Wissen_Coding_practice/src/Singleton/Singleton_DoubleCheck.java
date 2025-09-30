package Singleton;

public class Singleton_DoubleCheck {
    private static Singleton_DoubleCheck Instance=null;

    private Singleton_DoubleCheck(){}

    public static Singleton_DoubleCheck getInstance(){
        if(Instance==null){
            synchronized (Singleton_DoubleCheck.class){
                if(Instance==null){
                    Instance=new Singleton_DoubleCheck();
                    return Instance;
                }
            }
        }
        return Instance;
    }
}
