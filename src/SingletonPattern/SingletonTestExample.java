package SingletonPattern;

/**
 *
 * @author ahxxm
 */
public class SingletonTestExample {
    
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        boolean isSameInstance = (instance1 == instance2);
        System.out.println("Are the instances the same? " + isSameInstance);
    }
}

