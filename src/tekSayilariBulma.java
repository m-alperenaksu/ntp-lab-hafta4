// Kullanıcıdan alınan limit sayıya kadar olan tek sayıları yazdıran program.

import java.util.Scanner;

public class tekSayilariBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Limit sayıyı giriniz: ");
		int limit = input.nextInt();
		
		int i = 1;
		
		while(i <= limit) {
			System.out.println(i);
			i += 2;
		}

	}

}
