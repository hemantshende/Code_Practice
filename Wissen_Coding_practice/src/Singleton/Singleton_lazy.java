package Singleton;

public class Singleton_lazy {
    private static Singleton_lazy Instance=null;

    private Singleton_lazy(){};

    public static Singleton_lazy getInstance(){
        if(Instance==null){
            Instance= new Singleton_lazy();
            return Instance;
        }else{
            return Instance;
        }
    }
}
