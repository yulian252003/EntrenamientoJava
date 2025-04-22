package Opps;

public class HijaDeSuma extends Suma {

	public static void main(String[] args) {
		Suma ad = new Suma();
		ad.Sumar(2, 3);
		ad.Sumar(10, 40, 50);
		
		double d = ad.Sumar(2.5, 1.5, 2.4);
		System.out.println(d);

	}

}
