/* USING FUNCTIONAL INTERFACES AND LAMBDA EXPRESSIONS
 * 1 - Write code to send marketing messages. To do this, you must be able to send the same message to different services. These services must have a method for receiving the message as a parameter. The services that must be available are:
SMS;
Email;
Social Networks;
WhatsApp;
 */

package exercises.ex01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            startInteractiveMarketing(scanner);
        }
    }
    /**
     * Interactive method to send marketing messages using different services.
     * @param scanner The instance of Scanner to read user input.
     */
    private static void startInteractiveMarketing(Scanner scanner) {
        var marketing = new Marketing();

        System.out.println("Digite a mensagem de marketing que deseja enviar:");
        String messageToSend = scanner.nextLine();

        System.out.println("\nEscolha o serviço para enviar a mensagem:");
        System.out.println("1 - SMS");
        System.out.println("2 - E-mail");
        System.out.println("3 - Redes Sociais");
        System.out.println("4 - WhatsApp");
        System.out.print("Digite sua opção: ");

        int choice = scanner.nextInt();
        MessageService service;

        switch (choice) {
            case 1:
                service = message -> System.out.println("Enviando SMS: " + message);
                break;
            case 2:
                service = message -> System.out.println("Enviando E-mail: " + message);
                break;
            case 3:
                service = message -> System.out.println("Postando nas Redes Sociais: " + message);
                break;
            case 4:
                service = message -> System.out.println("Enviando WhatsApp: " + message);
                break;
            default:
                System.out.println("Opção inválida. Nenhuma mensagem foi enviada.");
                return; 
        }

        marketing.sendMessage(messageToSend, service);
        System.out.println("Mensagem enviada com sucesso!");
    }
}


