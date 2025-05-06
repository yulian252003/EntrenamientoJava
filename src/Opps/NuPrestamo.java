package Opps;

public class NuPrestamo extends BancoPrestamo{
	

	public static void main(String[] args) {
		
		NuPrestamo prestamo = new NuPrestamo();
		
		prestamo.setNombre("Juan");
		prestamo.setEdad(70);
		prestamo.setCantidad(5000);
		
		System.out.println("El nombre es: " + prestamo.getNombre());
		System.out.println("La edad es: " + prestamo.getEdad());
		System.out.println("La cantidad es: " + prestamo.getCantidad());
		
	}

}
