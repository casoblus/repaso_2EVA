import java.util.ArrayList;

class TestArrayList 
{
	private static void show( ArrayList<Integer> alst )
	{
			// tamaño del ArrayList
			int len = alst.size();
			
			for ( int i = 0; i < len; i++ )
			{
				System.out
						.println( alst.get(i) );
			}
	}
	

	public static void main ( String[] args )
	{
		// declaro arraylist
		// ArrayList<int> enteros = new ArrayList<int>(); 
		// ArrayList solo va con objetos
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		
		// introduzco valores con add
		enteros.add(5);
		enteros.add(18);
		enteros.add(40);
		enteros.add(12);
		enteros.add(13);
		enteros.add(34);

		show( enteros );
	}
}

