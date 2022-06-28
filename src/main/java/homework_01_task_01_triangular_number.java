//+Написать программу вычисления n-ого треугольного числа. url

import java.util.Scanner;

public class homework_01_task_01_triangular_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println(number + "th triangular number = " + triangularNumberRecursion(number));
    }

    public static int triangularNumberRecursion(int number) {
        if (number == 1) {
            return 1;
        } else return triangularNumberRecursion(number - 1) + number;
    }
}
