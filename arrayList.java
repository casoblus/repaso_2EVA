import java.util.ArrayList;
// para hacer chorraditas
import java.util.Arrays;

class TestArrayList 
{
	private static void show( ArrayList<Integer> alst )
	{
			// tamaño del ArrayList
			int len = alst.size();
			
			for ( int i = 0; i < len; i++ )
			{
				// obtengo el contenido de la posicion i con el metodo get
				int valor = alst.get ( i ); 
				System.out
						.println( valor );
			}
	}
	

	public static void main ( String[] args )
	{
		// declaro arraylist
		// ArrayList<int> enteros = new ArrayList<int>(); 
		// ArrayList solo va con objetos
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		
		System.out.println( "VACIO = " + enteros.isEmpty() );

		// introduzco valores con add
		enteros.add(5);
		enteros.add(18);
		enteros.add(40);
		enteros.add(12);
		enteros.add(13);
		enteros.add(34);

		show( enteros );

		System.out.println( "VACIO = " + enteros.isEmpty() );

		
		System.out.println( "CONTIENE 18 = " + enteros.contains(18) );
		
		System.out
				.println("CONVERTIR A ARRAY");

		// CONVIERTE A ARRAY ESTATICO
		// defino el array de tamaño enteros.size()
		System.out
				.print( "Definiendo Array > " );
		Integer[] arr = new Integer[ enteros.size() ];
			
		System.out
				.print( "Fijando tamaño > ");
		// añado los elementos del arraylist al nuevo array
		System.out
				.print( "Insertando elemenos > ");
		arr = enteros.toArray(arr);

		// Convierto arr en cadena para imprimirlo bonito
	
		System.out
				.print( "Convirtiendo a cadena ...");

		System.out
				.println( "");
		String cadena = Arrays.toString( arr );
		// Imprimo el resultado
		System.out
				.print( "Mostrando nuevo array > ");
		System.out
				.println(cadena);

		/*
		 * SET
		 */

		//System.out
		//		.println( "enteros.set(12,15); >>" );
		//enteros.set(12,15); // LA POSICION DEBE EXISTIR PREVIAMENTE

		// indexOf
		System.out
				.println( "enteros.indexOf(15);");
		
		System.out
				.println( enteros.indexOf(15));
		
		
		// lastIndexOf
		System.out
				.println("enteros.lastIndexOf(2);");
		
		System.out
				.println(enteros.lastIndexOf(18));
		
		// Añadir a una posicion que aun no existe
		// al igual que con set no puede hacerlo.
		try
		{
		System.out
			.println("enteros.add(100,122);");
			enteros.add(100,122);
		}
		catch (Exception e)
		{
			System.out.println( " ERROR :: No se puede guardar en posicion inexistente" );	
		}

		show(enteros);
	}
}

