package Opps;

public class Mazda extends Carro {
	static String nombre="mazda";
	
	
	public static void main(String[]args) {
		Carro car = new Carro();
		System.out.println(nombre);
		car.run();
	}

}
