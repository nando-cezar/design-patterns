package creational.singleton;

public class SingletonEage {
    
    private static SingletonEage instance = new SingletonEage();

    private SingletonEage(){ super(); }

    public static SingletonEage getInstance(){ 
        return instance; 
    }
}
