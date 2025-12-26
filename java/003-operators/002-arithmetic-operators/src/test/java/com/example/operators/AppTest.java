package com.example.operators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public class AppTest {
    public static void main(String[] args) {
        // Backup original System.in and System.out
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        // Simulate user input
        String simulatedInput = "4.5\n1\n2\n+\n";
        ByteArrayInputStream bais = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(bais);

        // Capture System.out
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream capturedOut = new PrintStream(baos);
        System.setOut(capturedOut);

        boolean testPassed = false;
        try {
            // Run the main method of the App class
            App.main(null);
            testPassed = true;
        } catch (NoSuchElementException e) {
            // This might happen if the input stream ends unexpectedly, which is fine for this test.
            testPassed = true;
        }
        catch (Exception e) {
            e.printStackTrace(originalOut);
        } finally {
            // Restore original System.in and System.out
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        String output = baos.toString();
        boolean hasSquareRootOutput = output.contains("A raiz quadrada de 4.5");

        if (testPassed && hasSquareRootOutput) {
            System.out.println("Test passed: The application handled decimal input correctly.");
        } else {
            System.err.println("Test failed: The application did not handle decimal input as expected.");
            System.err.println("Captured output:\n" + output);
            System.exit(1);
        }
    }
}