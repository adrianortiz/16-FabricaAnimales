package com.codizer;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public interface Animal {
	
	public static final int PERRO = 1;
	public static final int GATO = 2;
	public static final int ZORRO = 3;
	
	/**
	 * Método de acción comer Animal
	 * @return String
	 */
	public String comer();
}
