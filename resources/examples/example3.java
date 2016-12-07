import java.*;

class example3{
	private int dummie;
	private static double dummieFloat;
	public example3()
	{
		dummie = 10;
		dummieFloat = 1.20;
		
	}
	
	public void checkingIf ()
	{
		int  a, b, c ;
		
		a = 10 ;
		b = 11 ;
		c = b + a ;
		if ( a + c == b && a > 10 || c < 15 + 3 ){
			a = a + b ;}
		else{
			b = c ;}
	}
	
	private void checkingNestedIf ()
	{
		int a , b , c ;
		
		a = 10 ;
		b = 11 ;
		c = b + a ;
		if ( a + c == b && a > 10 ){
			if (c < 15 + 3 )
				{
					a = a + b ;
				}
			}
		else{
			b = c ;}
	}
}