package app;

public class StringUtil {
	//metodo que retorna se a String tá vazia ou não
	public static boolean isEmpty(String s) {
		if (s == null) {
			return true;
		}
		s = s.trim();
		return s.length() == 0;
	}
	
	//metodo que inverte a ordem dos caractres de uma string
	public static String reverse(String s) {
		if (s == null) {
			return s;
		}
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
