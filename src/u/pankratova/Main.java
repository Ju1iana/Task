package u.pankratova;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        System.out.println("Enter the size of the array (at least 10) ");

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        try {
            int i2 = Integer.parseInt(n);

        } catch (NumberFormatException e) {
            System.out.println("It's not Integer.");
            System.exit(0);
        }

        if (Integer.parseInt(n) < 10) {
            System.out.println("Number < 10. Try again.");
            System.exit(0);
        }

        int[] number = new int[Integer.parseInt(n)];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }

        /* Initial array: */
        System.out.print("Initial array: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        /* Initial array: */

        int sumStart = calculate.amount(number); //считаем сумму до удаления элемента

        int randomIndex = new Random().nextInt(number.length); //выбираем случайный индекс
        int randomNumber = number[randomIndex]; //получаем число по этому индексу

        number = ArrayUtils.removeElement(number, randomNumber); 


        /* Array with deleted number  */
        System.out.println();
        System.out.print("Array with deleted number ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        /* Array with deleted number  */


        // перемешиваем массив
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            int index = random.nextInt(number.length); 
            int a = number[index];
            number[index] = number[i];
            number[i] = a;
        }


        /* Mixed Array */
        System.out.println();
        System.out.print("Mixed Array: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        /* Mixed Array */

        int sumEnd = calculate.amount(number);

        System.out.println();
        System.out.println("Deleted number: " + (sumStart - sumEnd));

    }

}


