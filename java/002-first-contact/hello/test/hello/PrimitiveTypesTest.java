package hello;

public class PrimitiveTypesTest {
    public static void main(String[] args) {
        boolean pass = false;
        try {
            Class.forName("hello.PrimitiveTypes");
            System.out.println("Test passed: Class 'hello.PrimitiveTypes' found.");
            pass = true;
        } catch (ClassNotFoundException e) {
            System.err.println("Test failed: Class 'hello.PrimitiveTypes' not found.");
            e.printStackTrace();
        }

        // A simple assertion
        if (pass) {
            System.out.println("Verification successful!");
        } else {
            System.err.println("Verification failed!");
            System.exit(1); // Exit with an error code
        }
    }
}