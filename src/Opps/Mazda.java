package Opps;

public class Mazda extends Carro {
	//static String nombre="mazda";
	String nombre="Mazda";
	
	public void getNombre() {
		System.out.println(nombre);
		System.out.println(super.nombre);
	}
	
	public void run()
	{
		System.out.println("El Mazda está transitando");
		super.run();
	}
	
	Mazda()
	{
		//super();
		System.out.println("Llamando al constructor de Mazda");
		
	}
	
	public static void main(String[]args) {
		//Carro car = new Carro();
		//System.out.println(nombre);
		//car.run();
		
		//Primer uso
		Mazda maz= new Mazda();
		maz.getNombre();
		
		//Segundo uso
		maz.run();
	}

}
