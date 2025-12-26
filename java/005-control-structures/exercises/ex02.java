// 2. Write a program where the user enters their height and weight, the BMI (BMI = weight / (height * height)) is calculated, and a message is displayed according to the result:

/*
- If it is less than or equal to 18.5: "Underweight";
- If it is between 18.6 and 24.9: "Ideal weight";
- If it is between 25.0 and 29.9: "Slightly above ideal weight";
- If it is between 30.0 and 34.9: "Obesity Grade I";
- If it is between 35.0 and 39.9: "Obesity Grade II (Severe)";
- If it is greater than 40.0: "Obesity Grade III (Morbid)"; 
 */

public class ex02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();

        System.out.print("Enter your weight (in kilograms): ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        if (bmi <= 18.5) System.out.println("Underweight");
        if (bmi >= 18 && bmi <= 24.9) System.out.println("Ideal weight");
        if (bmi >= 25 && bmi <= 29.9) System.out.println("Slightly above ideal weight");
        if (bmi >= 30 && bmi <= 34.9) System.out.println("Obesity Grade I");
        if (bmi >= 35 && bmi <= 39.9) System.out.println("Obesity Grade II (Severe)");
        if (bmi >= 40) System.out.println("Obesity Grade III (Morbid)");

        sc.close();
    }

    
}
