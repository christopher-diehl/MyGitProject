import java.util.Scanner;

public class PersonView {
    private Scanner scanner;

    public PersonView() {
        scanner = new Scanner(System.in);
    }

    public String askName() {
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        return scanner.nextLine();
    }

    public String askBirthdate() {
        System.out.print("Bitte geben Sie Ihr Geburtsdatum ein: ");
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

}