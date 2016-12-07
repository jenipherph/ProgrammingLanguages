import java.*;

class example6{
	private int dummie;
	private static double dummieFloat;
	public example6()
	{
		dummie = 10;
		dummieFloat = 1.20;
		
	}
	
	public void checkingAssignment ()
	{
		int a , b , c , d;
		a = 10 ;
		b = 10 * a ;
		d = 10 + ( a + b);
		c = b + a % b + 5 * 2 / 3 - 4 + 5 * ( a +  4 * 15 ) ;
	}
}