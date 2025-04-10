package com.empresa;

public class SwitchCase {

	public static void main(String[] args) {
	String modulo="Contabilidad";
	
	switch(modulo)
	{
	case "Contabilidad":
		System.out.println("Ingreso al modulo de Contabilidad");
		//localizador
		break;
		
	case "Presupuesto":
		System.out.println("Ingreso al modulo de Presupuesto");
		//localizador
		break;
		
	case "Tesoreria":
		System.out.println("Ingreso al modulo de Tesoreria");
		//localizador
		break;
		
	case "Nomina":
		System.out.println("Ingreso al modulo de Nómina");
		//localizador
	break;
	
	case "Inventarios":
		System.out.println("Ingreso al módulo de inventarios");
		//localizador
	break;
	
	case "Indycom": 
		System.out.println("Ingreso al modulo de industria y comercio");
		//localizador
	break;
	
	case "Predial":
		System.out.println("Ingreso al módulo de predial");
	break;
	default:
	System.out.println("Regrese a la pagina y escoja un módulo");
	}
	}
}
