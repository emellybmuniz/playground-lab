public class User {
    // Attributes
    private int id;
    private String name;

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // toString method to print the object
    // prints the class name and the hash code of the object
    @Override
    public String toString() {
        return "User{}";
    }

    // equals method to compare two objects
    // two objects are considered equal if they are of the same class
    // It's a simplistic implementation and may not be suitable for all use cases
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return true;
    }
}
