package com.empresa;

public class MiPrimerPrograma2 {

	public static String saludo()
	{
		return "Hola mundo";
	}
	
	public static void main(String[] args) {
		System.out.println("Este es mi segundo programa");

		String mensaje = saludo();
		System.out.println(mensaje);
	}

}
