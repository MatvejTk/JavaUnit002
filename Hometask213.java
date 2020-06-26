package unit2;

import java.util.Scanner;

public class Hometask213 {

    public static void main(String args[]) {

        long r, n, ld = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            if (ld < r) {
                ld = r;
            }
            n = n / 10;
        }
        System.out.println("\nСамая большая цифра числа: " + ld);

    }
}
// По коду задач, которые решены серьезных замечаний нет

