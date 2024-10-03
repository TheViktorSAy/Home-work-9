import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println();
        System.out.println("Задание 1 ");
        int[] payments = new int[]{10, 5, 25, 60, 70};
        int sum = 0;
        for (int payment : payments) {
            sum += payment;

        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        System.out.println("Задание 2 ");

        int min = payments[0];
        int minIndex = 0;

        for (int i = 0; i < payments.length; i++) {
            if (payments[i] < min) {
                min = payments[i];
                minIndex = i;
            }
        }

        //System.out.println(min);
        //System.out.println(minIndex);

        int max = payments[0];
        int maxIndex = 4;

        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > max) {
                max = payments[i];
                maxIndex = i;
            }
        }

        //System.out.println(max);
        //System.out.println(maxIndex);
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();
        System.out.println("Задание 3 ");

        int all = 5;
        double average = sum/all;
        System.out.println("Средняя сумма трат за месяц составила " + average +" рублей");

        System.out.println();
        System.out.println("Задание 4 ");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);

        }


    }
}