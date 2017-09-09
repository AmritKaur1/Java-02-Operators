public class CastOperator
{
	public static void main(String[] args)
	{
		int x='a'; //implicit type casting
		System.out.println(x);

		double d=10; //implicit type casting
		System.out.println(d);

		int y=130;
		//byte b=y; -> CE:possible loss of precision
		byte b=(byte)y; //explicit type casting
		System.out.println(b);

		int z=150;
		short s=(short)z; //explicit type casting
		System.out.println(s);

		b=(byte)z; //explicit type casting
		System.out.println(b);

		double d1=130.34;
		x=(int)d1; //explicit type casting
		System.out.println(x);
	
		b=(byte)d1; //explicit type casting
		System.out.println(b);
	}
}