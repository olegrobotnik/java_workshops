//Написать программу вычисления n-ого треугольного числа. https://www.google.com/url?q=http://ru.wikipedia.org/wiki/%25D0%25A2%25D1%2580%25D0%25B5%25D1%2583%25D0%25B3%25D0%25BE%25D0%25BB%25D1%258C%25D0%25BD%25D0%25BE%25D0%25B5_%25D1%2587%25D0%25B8%25D1%2581%25D0%25BB%25D0%25BE&sa=D&source=docs&ust=1655220207346067&usg=AOvVaw3gJTO4FgcibF0Zo_INUoNm

//import java.util.Scanner;   //Use for console input

import java.util.Random;

public class homework_01_task_02_Harshad_numbers {


    public static void main(String[] args) {
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
