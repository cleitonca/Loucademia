package br.com.softblue.loucademia.application.util;

public class validation {
	
	//Esse método analisa se o usuário preencheu alguma coisa
	public static void assertNotEmpty(Object obj) {
		
		if(obj instanceof String) {
			
			String s = (String) obj;
			
			if(StringUtils.isEmpty(s)) {
				throw new ValidationException("O Texto não pode ser nulo");
			}
		}
		
		if(obj == null) {
			throw new ValidationException("Valor não pode ser nulo");
		}
		
	}
	

}
