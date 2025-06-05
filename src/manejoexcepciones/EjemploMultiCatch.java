package manejoexcepciones;

import java.io.*;

public class EjemploMultiCatch {

	public static void main(String[] args) {
	try
	{
		int resultado = 10 / 0; //Esto lanza AritmethiException
		FileReader file = new FileReader("archivo.txt");
		
	} catch (ArithmeticException | IOException e) {
		System.out.println("!Ocurrió una excepción");
		System.out.println(e.getClass().getSimpleName());
	}

	}

}
