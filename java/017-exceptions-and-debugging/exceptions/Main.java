import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
       try { // risky code
           FileOutputStream stream = new FileOutputStream("test.txt"); 
           stream.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (Exception e) {
           e.printStackTrace();
       }
       // fileOutpututstream its a class that throws checked exception
       // runTimeException -> unchecked exception
       // Throwable -> Exception -> IOException -> FileNotFoundException
       // outOfMemoryError -> Error -> Throwable
    }
}
