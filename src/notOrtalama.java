// Kullanıcıdan alınan kişi sayısı ve not bilgileriyle not ortalaması hesaplayan program.

import java.util.Scanner;
public class notOrtalama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Öğrenci sayısını giriniz:");
		double toplam = 0, temp;
		int sayac;
		int ogrenciSayisi = input.nextInt();
		sayac = ogrenciSayisi;
		while(ogrenciSayisi <= 0) ogrenciSayisi = input.nextInt();
		while(sayac > 0) {
			System.out.println("Not giriniz:");
			temp = input.nextDouble();
			toplam += temp;
			sayac--;
		}
		
		double ortalama = toplam / ogrenciSayisi;
		System.out.println("Ortalama = " + ortalama);
		
	}

}
