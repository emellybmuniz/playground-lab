package listsarrays;

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
    // Melhorado para mostrar os dados do usuário, o que ajuda na depuração.
    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", name='" + name + '\'' +
               '}';
    }

    // equals method to compare two objects
    // Esta implementação agora compara os objetos com base no 'id'.
    // Isso é crucial para que métodos como 'contains()' funcionem corretamente.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        // Dois usuários são considerados iguais se tiverem o mesmo id.
        return id == user.id;
    }

    // hashCode method to generate a hash code for the object
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
}
