package utilities;

import java.io.FileWriter;
import java.io.IOException;

//IMPOR LAS CLASES NECESARIO PARA MANEJO JSON
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class WriteJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
    // ------Estudiante 1 --------
		JSONObject estudiante1= new JSONObject();
		estudiante1.put("nombreEstudiante", "Lucas");
		estudiante1.put("grado", "Sexto");
		estudiante1.put("ubicacion", "Manizales");
		
		 // ------Estudiante 2 --------
		JSONObject estudiante2= new JSONObject();
		estudiante2.put("nombreEstudiante", "Natalia");
		estudiante2.put("grado", "Séptimo");
		estudiante2.put("ubicacion", "Bogota");
		
		 // ------Estudiante 3 --------
		JSONObject estudiante3= new JSONObject();
		estudiante3.put("nombreEstudiante", "Marcela");
		estudiante3.put("grado", "Noveno");
		estudiante3.put("ubicacion", "Medellin");
		
		//Arreglo de Estudiantes
		JSONArray detallesEstudiantes = new JSONArray();
		detallesEstudiantes.add(estudiante1);
		detallesEstudiantes.add(estudiante2);
		detallesEstudiantes.add(estudiante3);
		
		//Objeto contenedor principal
		JSONObject datos = new JSONObject();
		datos.put("detallesEstudiantes", detallesEstudiantes);
		
		System.out.println(datos.toJSONString());
		
		try(FileWriter archivo = new FileWriter("estudiantes.json")){
			archivo.write(datos.toJSONString());//Escre el contenido json como texto
			archivo.flush();//Fuerza la escritura inmediatam de los datos en el disco
			System.out.println("Archivo JSON guardado como 'estudiante.json' ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
