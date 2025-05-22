package strings;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hola");
		sb.append(" mundo");
		sb.insert(5, "Java");
		sb.replace(0, 4, "Hi");
		sb.delete(3, 7);
		
		
        System.out.println(sb);
        
	}

}
