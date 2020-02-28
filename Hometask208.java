package unit2;

import java.util.Scanner;

public class Hometask208 {

public static void main(String[] args) {
	// Треугольники ABC и DEF
			double a; 
			double b; 
			double c; 
			double d; 
			double e; 
			double f; 
			double p1; // полупериметр треугольника ABC
			double p2; // полупериметр треугольника DEF
			double s1; //Площадь первого треугольника
			double s2; //Площадь второго треугольника
			Scanner sc = new Scanner(System.in);
			System.out.print("Введите сторону А: ");
			a = sc.nextInt();
			System.out.print("Введите сторону B: ");
			b = sc.nextInt();
			System.out.print("Введите сторону C: ");
			c = sc.nextInt();
			System.out.print("Введите сторону D: ");
			d = sc.nextInt();
			System.out.print("Введите сторону E: ");
			e = sc.nextInt();
			System.out.print("Введите сторону F: ");
			f = sc.nextInt();
			p1 = a + b + c; // полупериметр треугольника ABC
			p2 = d + e + f; // полупериметр треугольника DEF
			s1 = Math.sqrt (p1 * (p1-a) * (p1-b) * (p1-c)); //Площадь первого треугольника
			s2 = Math.sqrt (p2 * (p2-a) * (p2-b) * (p2-c)); //Площадь второго треугольника
			if (s1 > s2) {
				System.out.println("Площадь первого треугольника больше");
			}
			if (s2 > s1) {
				System.out.println("Площадь второго треугольника больше");
			}
		}
	}