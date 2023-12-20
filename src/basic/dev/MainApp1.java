package basic.dev;

import java.util.Scanner;

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so nguyen n: ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}

		System.out.println("Tong cac so chia het cho 3 va nho hon " + n + " là: " + sum);
	}

}
