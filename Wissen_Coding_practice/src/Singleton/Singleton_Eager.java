package Singleton;

public class Singleton_Eager {
    private static Singleton_Eager Instance=new Singleton_Eager();

    private Singleton_Eager(){}

    public static Singleton_Eager getInstance(){
        if(Instance==null){
            Instance=new Singleton_Eager();
            return Instance;
        }else{
            return Instance;
        }
    }
}
