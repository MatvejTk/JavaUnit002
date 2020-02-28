package unit2;

import java.util.Scanner;

public class Hometask201 {

		public static void main(String[]args) {
			
			if (1 < 2) {
				System.out.println("7");
			}
			else  {
				System.out.println("8");
			}	
			if (1 < 2) {
				System.out.println("yes");
			}
			else  {
				System.out.println("no");
			}	
			Scanner sc = new Scanner(System.in);
			int a;
			int z = 3;
			System.out.print("Введите число а: ");
			a = sc.nextInt();
			if (a < z) {
				System.out.println("yes");
			}
			else if (a > z) {
				System.out.println("no");
			}
			else {
				System.out.println("В задаче не указано действие на равенство");
			}
			
		}			
}