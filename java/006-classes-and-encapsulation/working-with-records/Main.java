public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        var person = new Person("maria", 30);

        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person.age());
    }
}