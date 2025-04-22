package Opps;

public class Kia extends Mazda {
	
	static String modelo="x";

	public static void main(String[] args) {
		Mazda mz = new Mazda();
		Carro car = new Carro();
		System.out.println("El modelo es:"+modelo);
		System.out.println("La marca es:"+mz.nombre);
		System.out.println("El comportamiento es:");
		mz.run();
		car.run();
	

	}

}
