import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        final int ITERATIONS = 100000;

        // 1. Test with String (immutable)
        // With each concatenation (+), a new String object is created in memory.
        // This is inefficient for a large number of operations.
        Instant stringStart = Instant.now();
        @SuppressWarnings("unused")
        String stringConcat = "";
        for (int i = 0; i < ITERATIONS; i++) {
            stringConcat += "a";
        }
        Instant stringEnd = Instant.now();
        System.out.println("Tempo com String: " + Duration.between(stringStart, stringEnd).toMillis() + " ms");
        System.out.println("--------------------------------------------------");

        // 2. Test with StringBuilder (mutable, unsynchronized)
        // StringBuilder modifies the existing object, making it much faster.
        // It is the ideal choice for string concatenation in a single-threaded environment.
        Instant builderStart = Instant.now();
        StringBuilder builderConcat = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            builderConcat.append("a");
        }
        Instant builderEnd = Instant.now();
        System.out.println("Tempo com StringBuilder: " + Duration.between(builderStart, builderEnd).toMillis() + " ms");
        System.out.println("--------------------------------------------------");

        // 3. Test with StringBuffer (mutable, synchronized)
        // StringBuffer is also mutable, but its methods are ‘synchronized’.
        // This makes it safe for use in multi-threaded environments, but adds a
        // performance overhead, making it slower than StringBuilder.
        Instant bufferStart = Instant.now();
        StringBuffer bufferConcat = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            bufferConcat.append("a");
        }
        Instant bufferEnd = Instant.now();
        System.out.println("Tempo com StringBuffer: " + Duration.between(bufferStart, bufferEnd).toMillis() + " ms");
    }

    // setLength() - Sets the length of the character sequence.
    // deleteCharAt() - Removes the character at the specified index.
}