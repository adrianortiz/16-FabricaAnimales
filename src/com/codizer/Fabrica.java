package com.codizer;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public class Fabrica {
	
	/**
	 * Fabrica de objetos que devulve un objeto
	 * especifico.
	 * 
	 * @param tipo int
	 * @return Animal
	 */
	public static Animal crearObjeto(int tipo) 
	{
		switch (tipo) {
			case Animal.PERRO: 	return new Perro();
			case Animal.GATO:	return new Gato();
			case Animal.ZORRO:	return new Zorro();
			default: return null;
		}
	}
	
}
