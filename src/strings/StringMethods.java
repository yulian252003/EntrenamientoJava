package strings;

public class StringMethods {

	public static void main(String[] args) {
		String saludo="Hola Mundo";
		System.out.println(saludo.charAt(3));
		System.out.println("Longitud: " + saludo.length());
		System.out.println("En mayúsuculas: " + saludo.toUpperCase());
		System.out.println("¿Contiene 'Mun'? " + saludo.contains("Mun"));
		System.out.println("Reemplazo: " + saludo.replace("Mundo", "Java"));
		System.out.println(saludo.concat(" Bello"));
		System.out.println("Termina en 'Hola'?" +saludo.endsWith("Hola"));
		
		System.out.println("-------------------------");
		String text1="Hola Mundo";
		System.out.println(text1.equals(saludo));
		System.out.println("Indice de 'M': " + saludo.indexOf("Mundo"));
		System.out.println("Indice de 'Mundo': " + saludo.indexOf("Mundo"));
		System.out.println("Indice de 'Mundo': " + saludo.indexOf("Pepe"));
		
	}

}
