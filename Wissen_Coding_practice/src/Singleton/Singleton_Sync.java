package Singleton;

public class Singleton_Sync {
    private static Singleton_Sync Instance=new Singleton_Sync();

    private Singleton_Sync(){}

    public static synchronized Singleton_Sync getInstance(){
        if(Instance==null){
            Instance=new Singleton_Sync();
            return Instance;
        }else{
            return Instance;
        }
    }
}
