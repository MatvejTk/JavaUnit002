package unit2;

import java.util.Scanner;

public class Hometask207 {

	public static void main(String[] args) {
			double r1; // радиус первого круга
			double r2; // радиус второго круга
			double s1; // площадь первого круга
			double s2; // площадь второго круга
			Scanner sc = new Scanner(System.in);
			System.out.print("Введите радиус круга 1: ");
			r1 = sc.nextInt();
			System.out.print("Введите радиус круга 2: ");
			r2 = sc.nextInt();
			s1=Math.PI*Math.pow(r1, 2);
			s2=Math.PI*Math.pow(r2, 2);
			if (s1 > s2) {
				System.out.println("Площадь второго круга меньше");
	}
			else {
		System.out.println("Площадь первого круга меньше");
			}
	
		}
	}

