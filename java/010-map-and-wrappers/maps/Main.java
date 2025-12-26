import java.util.HashMap; 
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>(); 
        users.put("maria@gmail.com", new User(1, "Maria"));
        users.put("joao@gmail.com", new User(2, "João"));
        users.put("pedro@gmail.com", new User(3, "Pedro"));
        users.put("ana@gmail.com", new User(4, "Ana"));
        users.put("jose@gmail.com", new User(5, "José"));
        users.put("Emelly@gmail.com", new User(6, "Emelly"));


        System.out.println("--- Lista de Usuários ---");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            String email = entry.getKey();
            User user = entry.getValue();
            System.out.println("Chave: " + email + " | Valor: " + user);
        }

        System.out.println(("--------------------------"));
        // keySet(), values() and forEach()
        users.keySet().forEach(System.out::println);
        System.out.println(("--------------------------"));
        users.values().forEach(System.out::println);

        System.out.println(("--------------------------"));
        System.out.println("Buscando um usuário existente (get):");
        User foundUser = users.get("maria@gmail.com");
        System.out.println(foundUser);

        System.out.println("\nBuscando um usuário inexistente (retorna null):");
        User notFoundUser = users.get("inexistente@gmail.com");
        System.out.println(notFoundUser);

        System.out.println("\nBuscando um usuário inexistente com valor padrão (getOrDefault):");
        User defaultUser = new User(0, "Convidado");
        User userOrDefault = users.getOrDefault("inexistente@gmail.com", defaultUser);
        System.out.println(userOrDefault);
    }
}
