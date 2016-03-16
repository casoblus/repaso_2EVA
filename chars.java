// Arrays de char
//
import java.io.*; // para manejo de entrada/salida
import java.lang.Exception; // para manejo de excepciones

// Para jugar con los arrays
import java.util.Arrays;

class pruebachar
{	
	private static void ler( char[] arrai )
	{	
		int len = arrai.length; // Tamaño del array
		int i = 0, caracter;

		System.out
				.println( "TEXTO: " );

		try
		{
				while ( i < len - 1 ) 
				{
					caracter = System.in.read();
					
					// Salir si el caracter es newline o retorno de carro 
					// al pulsar intro
					if ( caracter == '\n' || caracter == '\r' ) 
							break;

					arrai[ i ] = (char)caracter;
					i++;
				}
		}
		catch ( IOException ioe )
		{
			// No hace nada
		}

		// sustituye el "intro" por '\0' 
		// asi se puede usar como final de la cadena
		arrai[ i ] = '\0';
	}

	public static void main ( String[] args )
	{
		// Defino el array para 50 caracteres
		char[] cadena = new char[50]; 

		// Leer de teclado y meter todo en el array que le paso
		ler( cadena );

		// como es un array
		// lo convierto en String y lo muestro
		// porque si
		String printable = Arrays.toString(cadena);
		System.out
				.println( printable );
	}
}
