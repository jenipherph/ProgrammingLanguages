import java.*;

class example7{
	protected int dummie;
	
	public example7()
	{
		double dummieFloat;
		dummie = 10;
		dummieFloat = 1.20;
		
	}
	
	public void checkingFor (int a, int b)
	{
		int c ;
		c = 5 ;
	
		for ( ;a <=  b + 15 ; )
		{
			a = a + 1 ;
			if ( a + c == b && a > 10 || c < 15 + 3 ){
				a = a + b ;}
			else{
				b = c ;}
		}
	}
	
	public void checkingCompleteFor (int a, int b)
	{
		int c ;
		int i ;
		c = 5 ;
	
		for ( i=1; a <=  b + 15 ; i = i  + 1)
		{
			a = a + 1 ;
			if ( a + c == b && a > 10 || c < 15 + 3 ){
				a = a + b ;}
			else{
				b = c ;}
		}
	}
	
	public void checkingInfiniteFor (int a, int b)
	{
		int c ;
		c = 20;
		for ( ; ; )
		{
			a = a + 1 ;
			if ( a + c == b && a > 10 || c < 15 + 3 ){
				a = a + b ;}
			else{
				b = c ;}
		}
	}
	
}