package unit2;

import java.util.Scanner;

public class Hometask206 {

	public static void main(String[] args) {
		int a; 
		int b; 
		int c;
		Scanner sc = new Scanner(System.in);
				System.out.print("Введите сторону а: ");
		a = sc.nextInt();
				System.out.print("Введите сторону b: ");
		b = sc.nextInt();
		System.out.print("Введите сторону c: ");
		c = sc.nextInt();
				if (a == b & b==c) {
			System.out.println("Треугольник является равносторонним");
		}
				else {
			System.out.println("Треугольник не является равносторонним");
			}
	}
}
