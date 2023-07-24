package SingletonPattern;

/**
 *
 * @author ahxxm
 */
public class Singleton {

    private static Singleton instance;

    // Private constructor to prevent direct instantiation
    private Singleton() {
        // Initialization code (if any)
    }

    // Static method to get the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the Singleton class
    public void showMessage() {
        System.out.println("Hello, I'm a Singleton instance!");
    }
}


