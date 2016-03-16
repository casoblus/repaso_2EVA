/**
 * Pruebas con la clase Array.
 */

import java.util.Arrays;
import java.util.Scanner;

class TestArray
{
	private static void show( int[] array )
	{
		int len = array.length;
		System.out.println( "CONTENIDO:" );
		for ( int i = 0; i < len; i++ )
		{
			System.out.println( array[ i ] );
		}
		System.out.println( "===========================" );
	}

	public static void main ( String[] args )
	{
		// inicializo un array de enteros
		
		int[] enteros = new int[10];

		// Relleno el array empleando el método fill

		Arrays.fill ( enteros, 1 );
		show( enteros );

		// Cambio algunos valores
		enteros[1] = 10;
		enteros[3] = 123;
		enteros[4] = 2;
		enteros[6] = 34;
		enteros[8] = 20;
		enteros[9] = 11;
		show( enteros );

		// ordeno el array con sort
		Arrays.sort( enteros );
		show( enteros );

		// busco 34 con binarySearch
		System.out
				.println( Arrays.binarySearch( enteros, 34 ) );


		String cadena = new String();
		cadena = Arrays.toString(enteros);
		
		System.out
				.println( cadena );

	}
}
