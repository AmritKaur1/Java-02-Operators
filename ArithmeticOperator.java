public class ArithmeticOperator
{
	public static void main(String args[])
	{
		//System.out.println(10/0); -> RE:divide by zero
		System.out.println(10/0.0); //infinite
		System.out.println(-10.0/0.0); //-infinite

		System.out.println(0.0/0); //NaN
		System.out.println(-0/0.0); //NaN

		System.out.println(10<Float.NaN); //false
		System.out.println(10<=Float.NaN); //false
		System.out.println(10>Float.NaN); //false
		System.out.println(10>=Float.NaN); //false
		System.out.println(10==Float.NaN); //false

		System.out.println(10!=Float.NaN); //true
		System.out.println(Float.NaN<Float.NaN); //false
		System.out.println(Float.NaN!=Float.NaN); //true
	}
}