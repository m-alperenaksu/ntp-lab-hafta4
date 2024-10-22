
public class SalerPeople {
	private String ad;
	private String soyad;
	private double haftalikMaas;
	private int satilanUrunMiktari;
	
	SalerPeople (String ad, String soyad, int satilanUrunMiktari){
		this.ad = ad;
		this.soyad = soyad;
		haftalikMaas = 1500 + (satilanUrunMiktari * 0.05);
		this.satilanUrunMiktari = satilanUrunMiktari;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public double getHaftalikMaas() {
		return haftalikMaas;
	}

	public void setHaftalikMaas(int haftalikMaas) {
		this.haftalikMaas = haftalikMaas;
	}

	public int getSatilanUrunMiktari() {
		return satilanUrunMiktari;
	}

	public void setSatilanUrunMiktari(int satilanUrunMiktari) {
		this.satilanUrunMiktari = satilanUrunMiktari;
	}
	
	public void show() {
		System.out.println("Satıcının adı: " + ad);
		System.out.println("Satıcının soyadı: " + soyad);
		System.out.println("Satıcının haftalık maaşı: " + haftalikMaas);
		System.out.println("Satıcının sattığı toplam ürün fiyatı: " + satilanUrunMiktari + " TL");
		
	}
	
	
}
