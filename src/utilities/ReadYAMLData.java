package utilities;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;


public class ReadYAMLData {

	public static void main(String[] args) throws FileNotFoundException, YamlException {
		
		//Contruye la ruta al archivo testData.yml dentro del proyecto
		String filepath = System.getProperty("user.dir") + "//testData.yml";
		
		//Abrir el archivo YAML
		FileReader file = new FileReader(filepath);
		
		//Crar un lector YAML a partir del archivo
		YamlReader reader = new YamlReader(file);
		
		//Leer el contenido del archivo YAML como Map con claves tipo String y valores tipo objet
		@SuppressWarnings("unchecked")
		Map<String, Object> testData = (Map<String, Object>)reader.read();
		
		// Extrae la lista de caoss de prueba bajo la clave testdata
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> testCases = (List<Map<String, Object>>) testData.get("testdata");
		System.out.println("Todos los casos de prueba");
		System.out.println(testCases);
		
		//Toma el primer caso de prueba (por ejemlo, LoginTest)
		Map<String, Object> logintTestData = testCases.get(0);
		System.out.println("Nombre del primer test:");
		System.out.println(logintTestData.get("testName"));
		
		//Extrae la lista de datos del primer caso de prubas.
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> loginTestDataData = (List<Map<String, Object>>)  logintTestData.get("data");
		System.out.println("Datos del primer test:");
		System.out.println(loginTestDataData);
		
	}

}
