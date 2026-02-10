import java.util.Scanner;

public class AuthenticationSystem {

    public static void main(String[] args) {
        String Username = "Ramlal";
        String Password = "ram@lal";
        Scanner scan = new Scanner(System.in);
        int i = 3;
        do {
            System.out.print("Username: ");
            String Input_U = scan.nextLine();
            if (Input_U.equals(Username)) {
                System.out.print("Password: ");
                String Input_P = scan.nextLine();
                if (Input_P.equals(Password)) {
                    System.out.println("Welcome Back " + Username);
                    break;
                } else {
                    System.out.println("Try again... You have " + (i - 1) + " attempts left");
                    i--;
                }
            } else {
                System.out.println("Try again... You have " + (i - 1) + " attempts left");
                i--;
            }
        } while (i > 0);
        scan.close();

    }
}