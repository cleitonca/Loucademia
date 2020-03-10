package br.com.softblue.loucademia.application.util;

public class StringUtils {
	
	//Método para identificar se uma string é ou não nula
	public static boolean isEmpty(String s) {
		
		if(s == null) { //compara se o que tem dentro da string é nulla. Se sim, retorna dizendo que a string é nula
			return true;
		}
		
		return s.trim().length() == 0; //Se chegar aqui vai dizer que a String não está vazia!
		
	}
	
	//Método que adiciona zeros a esquerda
	public static String leftZeroes(int value, int finalSize) {
		return String.format("%0" + finalSize + "d", value);
	}
	
	
	public static void main(String[] args) {
		
		String str = "abc";
		
		boolean b = StringUtils.isEmpty(str);
		
		System.out.println(b);
		
		int v = 100;
		System.out.println(StringUtils.leftZeroes(v, 8));
		
	}
	

}
