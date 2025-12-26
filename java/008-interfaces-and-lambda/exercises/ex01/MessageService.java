package exercises.ex01;

@FunctionalInterface
public interface MessageService {
    /**
     * Send a message
     * @param message the message to be sent
     */
    void send(String message);
}