import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static double add(Scanner scanner) {
        System.out.println("entrer le 1er number:");
        double input1 = Main.scanner.nextDouble();

        System.out.println("entrer le 2er number:");
        double input2 = Main.scanner.nextDouble();

        double sum = input1 + input2;
        System.out.println("la sum et: " + sum);

        return sum;
    }

    static double sous(Scanner scanner) {

        System.out.println("entrer le 1er number:");
        double input1 = Main.scanner.nextDouble();

        System.out.println("entrer le 2er number:");
        double input2 = Main.scanner.nextDouble();

        double Sous = input1 - input2;
        System.out.println("la Soustraction et: " + Sous);

        return Sous;

    }

    static double multi(Scanner scanner) {
        System.out.println("entrer le 1er number:");
        double input1 = Main.scanner.nextDouble();

        System.out.println("entrer le 2er number:");
        double input2 = Main.scanner.nextDouble();

        double multi = input1 * input2;
        System.out.println("la Multiplication et: " + multi);

        return multi;
    }

    static double div(Scanner scanner) {
        System.out.println("entrer le 1er number:");
        double input1 = Main.scanner.nextDouble();

        System.out.println("entrer le 2er number:");
        double input2 = Main.scanner.nextDouble();

                if (input2==0){
                    System.err.println("error : cannot divided by 0!");
                }

        double div = input1 / input2;
        System.out.println("la division et: " + div);

        return div;
    }

    static double power(Scanner scanner) {
        System.out.println("entrer le base:");
        double input1 = Main.scanner.nextDouble();

        System.out.println("entrer l'Exposant:");
        double input2 = Main.scanner.nextDouble();

        double result = Math.pow(input1, input2);
        System.out.println("la Puissance et: " + result);

        return result;
    }

    static double sqrt(Scanner scanner) {
        System.out.println("entrer un positif number:");
        double input1 = Main.scanner.nextDouble();
            if (input1<0){
                System.err.println("error : please enter positive number");
            }
        double result = Math.sqrt(input1);
        System.out.println("le Racine carrée et: " + result);

        return result;

    }

    static double factor(Scanner scanner) {

        System.out.println("entrer un number:");
        double input = Main.scanner.nextDouble();
        long factorial = 1;
        int i;
        for (i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println("le Factorielle de " + input + "et " + factorial);
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Display the list of options
            System.out.println("\n~~~~~~~~ C A L C U L A T O R ~~~~~~~~~~");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Factorial");
            System.out.println("0. Exit");
            System.out.println("\n---------------------------------------");
            System.out.print("Please choose an option: ");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    add(scanner);
                    break;
                case 2:
                    sous(scanner);
                    break;
                case 3:
                    multi(scanner);
                    break;
                case 4:
                    div(scanner);
                    break;
                case 5:
                    power(scanner);
                    break;
                case 6:
                    sqrt(scanner);
                    break;
                case 7:
                    factor(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the calculator. Goodbye!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.err.println("Invalid choice. Please try again.");
            }


        }
    }
}