public record Person(String name, int age) {

    // can use to add validation
    public Person {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age must be non-negative.");
        }
    }

} // Record don't need getters, setters, toString, equals, hashCode
  // Records are immutable, once created, their data only can be read
