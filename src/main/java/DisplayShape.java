import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");

        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    System.out.println("Draw the top-left square triangle");
                    System.out.println("* * * * *");
                    System.out.println("* * * *");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");
                    System.out.println("Draw the top-right square triangle");
                    System.out.println("* * * * *");
                    System.out.println("  * * * *");
                    System.out.println("    * * *");
                    System.out.println("      * *");
                    System.out.println("        *");
                    System.out.println("Draw the bot-left square triangle");
                    System.out.println("* ");
                    System.out.println("* * ");
                    System.out.println("* * *");
                    System.out.println("* * * *");
                    System.out.println("* * * * *");
                    System.out.println("Draw the bot-right square triangle");
                    System.out.println("        *");
                    System.out.println("      * *");
                    System.out.println("    * * *");
                    System.out.println("  * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("Draw isosceles triangle");
                    System.out.println("    *");
                    System.out.println("   * *");
                    System.out.println("  * * *");
                    System.out.println(" * * * *");
                    System.out.println("* * * * *");
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice !");
            }
        }
    }
}
