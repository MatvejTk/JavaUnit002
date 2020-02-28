package unit2;

import java.util.Scanner;

public class Hometask205 {

		public static void main(String[] args) {
			int a;
			int b; 
			int c=2; // вторая степень
			Scanner sc = new Scanner(System.in);
			System.out.print("Введите сторону А: ");
			a = sc.nextInt();
			System.out.print("Введите сторону B: ");
			b = sc.nextInt();
			double d=Math.pow(a, c);
			double e=Math.pow(b, c);
			if (d > e) {
				System.out.println("Квадрат значения b меньше квадрата значения a ");
			}
			if (d < e) {
				System.out.println("Квадрат значения a меньше квадрата значения b");
			}
		}
	}