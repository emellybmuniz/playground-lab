import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class AppTest {

    @Test
    public void testCalculateSquareRoot() {
        String input = "6.25";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.calculateSquareRoot(new Scanner(System.in));

        String expectedOutput = "Entre com um número para calcular a raiz quadrada: A raiz quadrada de 6.25 é: 2.5";
        // Normalize line separators for comparison
        String actualOutput = outContent.toString().replaceAll("\\s+", " ").trim();
        expectedOutput = expectedOutput.replaceAll("\\s+", " ").trim();

        assertEquals(expectedOutput, actualOutput);
    }
}