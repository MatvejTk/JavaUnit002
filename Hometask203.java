package unit2;

import java.util.Scanner;

public class Hometask203 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int a;
				int b;
				System.out.print("Введите число а: ");
				a = sc.nextInt();
				System.out.print("Введите число b: ");
				b = sc.nextInt();
				if (a > b) {
					System.out.println("Число a наибольшее");
				}
				else if (a < b) {
					System.out.println("Число b наибольшее");
				}
				else {
					System.out.println("Числа a и b равны");
				}
				
			}			
	}