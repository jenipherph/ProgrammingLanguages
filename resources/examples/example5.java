import java.*;

class example5{
	private int dummie;
	private static double dummieFloat;
	public example5()
	{
		dummie = 10;
		dummieFloat = 1.20;
		
	}
	
	public void checkingWhile ()
	{
		int a, b, c ;
		a = 1 ;
		b = 20 ;
		c = 10 ; 
	
		while ( a <=  b + 15 )
		{
			a = a + 1 ;
			if ( a + c == b && a > 10 || c < 15 + 3 ){
				a = a + b ;}
			else{
				b = c ;}
		}
	}
}