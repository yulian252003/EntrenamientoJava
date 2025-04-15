package com.empresa;

public class Estudiantes {
	
	
	public Estudiantes()
	{
		System.out.println("Hola, estoy en el constructor");
	}
	
	int numero;
	String nombre;
	
	public Estudiantes(int i, String n)
	{
		numero=i;
		nombre=n;
	}
	
	public void desplegar()
	{
		System.out.println("Numero es: " +numero+ "Y Nombre es: "+nombre);
	}

	public static void main(String[] args) {
		
		Estudiantes estud = new Estudiantes();
		
		Estudiantes estud2 = new Estudiantes(1,"Juan");
		Estudiantes estud3 = new Estudiantes(2,"Laura");
		estud2.desplegar();
		estud3.desplegar();
		
		
	}

}
