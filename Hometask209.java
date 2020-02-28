package unit2;

import java.util.Scanner;

public class Hometask209 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){      
        	double[] a = new double[3];
        for (int i = 0; i < 3 ; i++) {
            System.out.print("Введите действительное число: ");
            if (sc.hasNextDouble()) {
                a[i] = sc.nextDouble();
            }
        }
        System.out.println("Результат:");
        for (int i = 0; i < 3; i++) {
            double result = a[i];
            System.out.print(a[i]);
            if(a[i] < 0) {
                result *= result;
                System.out.print(" Отрицательное число возвели в четвертую степень ");
            } else {
                System.out.print(" Неотрицательное число возвели в квадрат ");
            }
            System.out.println(result);
        }
        }
    }
}