public class Fibonacci{
	
	public static int result(int iteracion){
		if ( iteracion < 0 ) { return 0;}
		if ( iteracion == 0 || iteracion == 1 ){ return iteracion;}
		if ( iteracion == 2 ) { return 1; }
		int result = 2;
		int var1 = result;
		int var2 = 1;
		for ( int x = 2; x < iteracion - 1 ; x++){
			result = var1 + var2;
			var2 = var1;
			var1 = result;
		}
		return result;
	}
	
	
	
	public static void main (String[] args){
		System.out.println(result(7));
		System.out.println(result(5));
		System.out.println(result(10));
	}

}