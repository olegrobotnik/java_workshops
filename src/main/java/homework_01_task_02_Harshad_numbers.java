//import java.util.Scanner;   //Use for console input

import java.util.Random;

public class homework_01_task_02_Harshad_numbers {


    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);   //Console input
//        System.out.println("Enter the Harshad number: ");
//        int inputNumber = input.nextInt();
//        System.out.println(inputNumber);

//        while (!HarshadNumber()) {
//            continue;
//        }
        while (!HarshadNumber()) {   //Equals the previous loop
        }
    }

    public static boolean HarshadNumber() {   //The method of calculating the Harshad number mathematically
        int sumOfDigits = 0;
        Random random = new Random();
        int randomNumber = random.nextInt(1730);
        int number = randomNumber;
        while (number > 0) {
            sumOfDigits += (number % 10);
            number = number / 10;
        }
        if (randomNumber % sumOfDigits != 0) {
            System.out.println("!Harshad number = " + randomNumber + " % " + sumOfDigits + " = 1");
            return false;
        } else {
            System.out.println("Harshad number " + randomNumber + " % " + sumOfDigits + " = 0");
            return true;
        }
    }
}
