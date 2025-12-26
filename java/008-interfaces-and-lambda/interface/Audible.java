/**
 * This is an interface. It defines a "contract" for what an Audible object can do.
 * Any class that implements this interface MUST provide an implementation for the makeSound() method.
 */
public interface Audible {

    // 1. Constants
    // All variables in an interface are implicitly `public static final`.
    String DEFAULT_SOUND = "SILENCE";

    // 2. Abstract Method
    // This method has no body. It's implicitly `public` and `abstract`.
    // It defines a behavior that implementing classes must have.
    void makeSound();

    // 3. Default Method (since Java 8)
    // This method has a default implementation. A class can use this default
    // implementation or provide its own (override it).
    default void printSoundType() {
        System.out.println("This is a generic sound.");
    }

    // 4. Static Method (since Java 8)
    // This method belongs to the interface itself, not to an instance of a class.
    // It must be called using the interface name, e.g., Audible.getInterfaceInfo().
    static String getInterfaceInfo() {
        return "This is the Audible interface, used for objects that can make a sound.";
    }
}
