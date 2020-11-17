import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int min = -1;
        int max = -1;
        boolean isNum = scanner.hasNextInt();

        while (true) {

            if (isNum) {
                int firstNum = scanner.nextInt();
                int secondNum = scanner.nextInt();
                if (firstNum < secondNum) {
                    min = firstNum;
                    max = secondNum;
                } else {
                    min = secondNum;
                    max = firstNum;
                }
            } else {
                System.out.println("Invalid number.");
                break;
            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            scanner.nextLine();
        }
        scanner.close();
    }
}
