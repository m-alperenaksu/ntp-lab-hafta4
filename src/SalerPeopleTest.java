import java.util.Scanner;
public class SalerPeopleTest {

	public static void main(String[] args) {
		Scanner input_s = new Scanner(System.in);
		Scanner input_i = new Scanner(System.in);
		
		String ad, soyad;
		int satilanA, satilanB, satilanUrunMiktari;
		
		System.out.println("Satıcının adını giriniz : ");
		ad = input_s.nextLine();
		System.out.println("Satıcının soyadını giriniz: ");
		soyad = input_s.nextLine();
		System.out.println("Satıcı kaç adet A ürünü satmıştır?: ");
		satilanA = input_i.nextInt();
		System.out.println("Satıcı kaç adet B ürünü satmıştır?: ");
		satilanB = input_i.nextInt();
		
		satilanUrunMiktari = (10 * satilanA) + (15 * satilanB);
		
		SalerPeople saler1 = new SalerPeople(ad,soyad,satilanUrunMiktari);
		
		saler1.show();
	}

}
