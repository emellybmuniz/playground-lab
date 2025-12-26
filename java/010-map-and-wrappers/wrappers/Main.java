public class Main {
    public static void main(String[] args) {
        // Wrappers, Primitives, and Autoboxing

        // 1. Primitive Types vs Wrapper Classes
        // Java has primitive types, which are the most basic data types.
        // They are not objects and store the actual value directly in memory.
        int a = 10; // 'int' is a primitive type.

        // For every primitive type, there's a corresponding "wrapper" class.
        // For 'int', the wrapper is 'Integer'. These are real objects.
        Integer b = 20; // 'b' is an object of the Integer class.

        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer: " + b);

        // 2. Autoboxing and Unboxing
        // Autoboxing is the automatic conversion that the Java compiler makes
        // between the primitive types and their corresponding object wrapper classes.
        // Here, the primitive 'int' 100 is automatically converted to an Integer object.
        Integer c = 100; // This is autoboxing. It's like writing: Integer c = Integer.valueOf(100);

        // Unboxing is the reverse: converting an object of a wrapper type to its
        // corresponding primitive value.
        int d = c; // This is unboxing. It's like writing: int d = c.intValue();
        System.out.println("Unboxed value: " + d);

        // 3. The danger of 'null' with Wrappers
        // A key difference I need to remember is that wrapper objects can be 'null',
        // but primitives cannot.
        Integer nullableInteger = null;
        // int nonNullableInt = null; // This would cause a compilation error.

        // If I try to unbox a 'null' Integer, I'll get a NullPointerException.
        try {
            int e = nullableInteger; // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException!");
        }

        // 4. Passing primitives to methods (Pass-by-value)
        // When I pass a primitive variable like 'a' to a method,
        // a copy of its value is passed. The original variable 'a' is not affected.
        System.out.println("Original 'a' before method call: " + a);
        modifyPrimitive(a);
        System.out.println("Original 'a' after method call: " + a); // 'a' is still 10!

        // 5. Using 'final' in method parameters
        // I can use the 'final' keyword on a method parameter. This means I cannot
        // reassign the parameter to a new value inside that method. It makes the
        // parameter effectively a read-only constant within the method's scope.
        useFinalParameter(a);
    }

    public static void modifyPrimitive(int x) {
        x = x + 100; // This modification only affects the copy 'x', not the original variable.
        System.out.println("Value of 'x' inside modifyPrimitive: " + x);
    }

    public static void useFinalParameter(final int x) {
        // x = 50; // This line would cause a compilation error because 'x' is final.
        System.out.println("The final parameter 'x' has the value: " + x);
    }
}