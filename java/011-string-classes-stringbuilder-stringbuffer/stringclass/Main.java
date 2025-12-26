public class Main {

    public static void main(String[] args) {
        // Methods of String class
        String str1 = "Hello, World!";
        String str2 = "Hello, Java!" + " Hello, World!";

        var replacement1 = str1.replaceAll("World", "Java");
        var replacement2 = str2.replaceFirst("Hello", "Hi");

        System.out.println(replacement1);
        System.out.println(replacement2);

        System.out.println("--------------------");

        String str3 = "  Java Programming  ";
        System.out.println("Before trim: '" + str3 + "'");
        System.out.println("After trim: '" + str3.trim() + "'");

        System.out.println("--------------------");

        String str4 = "java";
        System.out.println(str4.toUpperCase());
        System.out.println(str4.equalsIgnoreCase("JAVA"));

        System.out.println("--------------------");

        String str5 = "apple,banana,cherry";
        String[] fruits = str5.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("--------------------");

        String str6 = "HELLO JAVA";
        System.out.println(str6.toLowerCase());
        System.out.println(str6.startsWith("HELLO")); // STARTS WITH?
        System.out.println(str6.contains("Hello")); // CONTAINS "Hello"
        System.out.println(str6.endsWith("JAVA")); // ENDS WITH?
        System.out.println(str6.charAt(4)); // CHARACTER AT INDEX 4
        System.out.println(str6.indexOf("JAVA")); // INDEX OF "JAVA"

        System.out.println("--------------------");

        String str7 = "";
        System.out.println(str7.isEmpty()); // IS EMPTY?
        System.out.println(str7.length()); // LENGTH OF STRING
        System.out.println(str7.concat("Not Empty Anymore")); // CONCATENATE STRINGS

        System.out.println("--------------------");

        // Using Text Blocks (Java 13+)
        String str8 = """
                {
                    "name": "John",
                    "age": 30,
                    "city": "New York"
                }
                """;

        System.out.println(str8);

        String str9 = """
            {
                "name": "%s",
                "age": "%d",
                "city": "%s"
            }
            """.formatted("Alice", 25, "Los Angeles");
        System.out.println(str9);
    }
}