import java.util.Scanner;
public class consoleio {
    public static void main(String[] args) {
        
    
    System.out.println("Please enter your first and your last name, on separate lines.");
    
    Scanner scanner = new Scanner(System.in);
    String firstName = scanner.nextLine();
    String lastName = scanner.nextLine();
    
    System.out.println("Hello, " + firstName + " " + lastName + "!");
    }
}
