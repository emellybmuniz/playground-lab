package exercises.ex01;

public class Marketing {
    public void sendMessage(String message, MessageService service) {
        service.send(message);
    }
}
