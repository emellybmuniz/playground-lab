import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePersistence persistence = getFilePersistence();
        System.out.println("=== Find All ===");
        System.out.println(persistence.findAll());
        System.out.println("=== Find By ===");
        System.out.println(persistence.findBy("ana"));
        System.out.println("------------------------------------");
        System.out.println(persistence.findBy("oliveira"));
        System.out.println("------------------------------------");
        System.out.println(persistence.findBy("souza"));
        System.out.println("------------------------------------");
        System.out.println(persistence.findBy("2002"));
        System.out.println("------------------------------------");
        System.out.println(persistence.findBy("1990"));
        System.out.println("------------------------------------");
        System.out.println(persistence.findBy("1990"));
        System.out.println("------------------------------------");
        System.out.println("=== Find All By ===");
        System.out.println(persistence.findAllBy("hotmail"));
        System.out.println("------------------------------------");
        System.out.println(persistence.findAllBy("gmail"));
        System.out.println("=== FindBy and Remove ===");
        System.out.println(persistence.remove("Emelly"));
        System.out.println(persistence.findBy("Emelly"));
        System.out.println("=== FindBy and Replace ===");
        System.out.println(persistence.replace("Ana Maria", "Emelly"));
        System.out.println(persistence.findBy("Ana Maria"));
    }

    private static FilePersistence getFilePersistence() throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.csv");
        persistence.write("Luisa;Luisa.oliveira@hotmail.com;05/07/2002");
        persistence.write("Lucas;lucas.silva@gmail.com;12/03/1998");
        persistence.write("Emelly;emellybmuniz@gmail.com;25/10/2005");
        persistence.write("João;joao.pereira@gmail.com;17/01/1993");
        persistence.write("Julia;julia.souza@hotmail.com;15/08/1990");
        persistence.write("Pedro;pedro.santos@gmail.com;23/11/1995");
        persistence.write("Mariana;mariana.costa@hotmail.com;30/08/2000");
        persistence.write("Felipe;felipe.almeida@hotmail.com;14/04/1999");
        persistence.write("Ana;ana.oliveira@gmail.com;05/07/2002");
        persistence.write("Beatriz;beatriz.ferreira@hotmail.com;28/12/2001");
        persistence.write("Rafael;rafael.gomes@gmail.com;03/10/1996");
        persistence.write("Ana;ana.lima@hotmail.com;22/11/1985");
        persistence.write("Sofia;sofia.rocha@gmail.com;21/02/1997");
        persistence.write("Carlos;carlos.souza@hotmail.com;10/05/1992");
        persistence.write("Julia;julia.martins@gmail.com;19/09/1994");
        persistence.write("Ana Maria;anaa.maria@hotmail.com;15/08/1990");
        return persistence;
    }
}
