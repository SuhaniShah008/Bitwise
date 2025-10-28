import java.util.Scanner;

public class Bitwise {

    private static int numberOne;
    private static int numberTwo;
    static int symbolNumber;
    private static String[] symbols = {"|", "&", "^", "<<"};
    private static String randomSymbol;
    private static int answer;
    private static Scanner sc = new Scanner(System.in);

    // Generates two random numbers
    public static void generateNumbers() {
        numberOne = (int) (Math.random() * 11);
        numberTwo = (int) (Math.random() * 11);
    }

    // Calculates the bitwise operation result and returns it
    public static int fillBlanks() {
        symbolNumber = (int) (Math.random() * 4);
        randomSymbol = symbols[symbolNumber];

        switch (randomSymbol) {
            case "|":
                return numberOne | numberTwo;
            case "&":
                return numberOne & numberTwo;
            case "^":
                return numberOne ^ numberTwo;
            case "<<":
                return numberOne << numberTwo;
            default:
                return 0;
        }
    }

    // Displays a random blank and handles user input
    public static void chooseBlank() {
        int randomNumber = (int) (Math.random() * 5);
        answer = fillBlanks(); // Calculate the answer before choosing a blank

        if (randomNumber == 1) {
            System.out.println("_ " + randomSymbol + " " + numberTwo + " = " + answer);
            System.out.print("Enter what you put in the blank space: ");
            int userInput = sc.nextInt();
            if(userInput==numberOne) {
                System.out.println("The answer is right!");
            }
            else {
                System.out.println("The answer is wrong it should be: "+ numberOne);
   
            }
        } else if (randomNumber == 2) {
            System.out.println(numberOne + " _ " + numberTwo + " = " + answer);
            System.out.print("Enter what you put in the blank space: ");
            String userInput = sc.next();
            if(userInput.equals(randomSymbol)) {
                System.out.println("The answer is right!");
            }
            else {
                System.out.println("The answer is wrong it should be: "+ randomSymbol);
   
            }
        } else if (randomNumber == 3) {
            System.out.println(numberOne + " " + randomSymbol + " _ = " + answer);
            System.out.print("Enter what you put in the blank space: ");
            int userInput = sc.nextInt();
            if(userInput==numberTwo) {
                System.out.println("The answer is right!");
            }
            else {
                System.out.println("The answer is wrong it should be: "+ numberTwo);
            }
        } else {
            System.out.println(numberOne + " " + randomSymbol + " " + numberTwo + " = _");
            System.out.print("Enter what you put in the blank space: ");
            int userInput = sc.nextInt();
            if(userInput==answer) {
                System.out.println("The answer is right!");
            }
            else {
                System.out.println("The answer is wrong it should be: "+ answer);
   
            }
        }
    }

    public static void main(String[] args) {
        
        generateNumbers();
        chooseBlank();
    }
}