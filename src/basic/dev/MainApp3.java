package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so nguyen n: ");
		int n = sc.nextInt();
		sc.close();

		int soBanDau = 0;
		int soGoc = n;

		for (int temp = n; temp != 0; temp /= 10) {
			int digit = temp % 10;
			soBanDau = soBanDau * 10 + digit;
		}

		if (soGoc == soBanDau) {
			System.out.println(n + " la so Palindrome.");
		} else {
			System.out.println(n + " khong la so Palindrome.");
		}
	}

}
