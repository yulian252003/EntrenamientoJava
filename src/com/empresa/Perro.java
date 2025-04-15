package com.empresa;

public class Perro {

	String nombre="Balto";
	String raza="Criollo";
	int altura=4;
	
	 public void ladrar()
     {
  	   System.out.println(nombre + "Esta ladrando");
     }
	
	
	public static void main(String[] args) {
		
		Perro perro = new Perro();
		System.out.println(perro.altura);
		perro.ladrar();
		
      

}
}