package strings;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hola");
		sb.append(" mundo");
		sb.insert(5, " Java");
		sb.replace(0, 4, "HI");
		sb.delete(3, 8);
		sb.reverse();
       System.out.println(sb);
	}

}
