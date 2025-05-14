package arreglo;

public class PasarArregloAmetodo {
	
	//pasar arreglo a metodo
	
	public static void Encontrar(int arregloTres[])
	{
		int min = arregloTres[0];
		for(int i=0; i<arregloTres.length;i++)
		{
			if(min>arregloTres[i])
			{
				min=arregloTres[i];
			}
		}
		System.out.println("El elemento menor es: " + min);
		
	}
	
	public static int[] getArreglo()
	{
		return new int[] {2,4,6,1,10,12,14,16};
	}

	public static void main(String[] args) {
		
		PasarArregloAmetodo arr = new PasarArregloAmetodo();
        int arregloPrueba[]= {3,6,1,5,10,80};
        arr.Encontrar(arregloPrueba);
        
        //----------------------------//
        int arregloCuarto[] = arr.getArreglo();
        System.out.println(arregloCuarto[2]);
	}

}
