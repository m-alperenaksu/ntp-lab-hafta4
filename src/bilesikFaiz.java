// 10 yıl boyunca her bir yılın bileşik faizini hesaplayıp yazdıran program.

public class bilesikFaiz {

	public static void main(String[] args) {
		int p = 1000;
		double r = 0.05d;
		double a;
		for(int n = 1; n <= 10; n++) {
			a = p * Math.pow(1+r,n);
			System.out.println(n + ". yılın sonundaki para = " + a);	
		}
	}

}
