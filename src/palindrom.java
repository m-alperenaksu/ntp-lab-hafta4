//	Girilen bir sayının palindrom olup olmadığını kontrol eden program.
// Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir. 

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Lütfen kontrol etmek istediğiniz sayıyı giriniz: ");
	int sayi = input.nextInt();
	int tersSayi = terstenYazdir(sayi);
	if (sayi == tersSayi) System.out.println("Girmiş olduğunuz sayı palindromdur.");
	else System.out.println("Girmiş olduğunuz sayı palindrom değildir.");
	}
	
	public static int terstenYazdir(int sayi) {
		int ters = 0;
		while(sayi > 0) {
			ters = (ters * 10) + (sayi % 10);
			sayi = sayi / 10;
		}
		return ters;
	}

}
