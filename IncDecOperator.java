public class IncDecOperator
{
	public static void main(String args[])
	{
		int x=10;
		System.out.println("initial value of x= "+x); //10
		char ch='a';
		System.out.println("initial value of ch= "+ch);  //a
		ch++;

		System.out.println("final value of ch= "+ch); //b
		double d=10.5;
		System.out.println("initial value of d= "+d); //10.5
		d++;
		System.out.println("final value of d= "+d); //11.5

		boolean b=true;
		System.out.println("initial value of b= "+b); //true
		//b++; operator ++ can't be applied to boolean
		//System.out.println("final value of b= "+b);

		final int z=10;
		//z++; can't assign a value to final variable z
		//System.out.println("initial value of z= "+z);

		int y=++x;
		//int y=++10; unexpected type
		//int y=++(++x); nesting of increment operator not allowed
		System.out.println("value of y= "+y); //11
		System.out.println("final value of x= "+x); //11

		x=10;	
		System.out.println("initial value of x= "+x); //10
		y=x++;
		System.out.println("value of y= "+y); //10
		System.out.println("final value of x= "+x); //11

		x=10;
		System.out.println("initial value of x= "+x); //10
		y=--x;
		System.out.println("value of y= "+y); //9
		System.out.println("final value of x= "+x); //9

		x=10;
		System.out.println("initial value of x= "+x); //10
		y=x--;
		System.out.println("value of y= "+y); //10
		System.out.println("final value of x= "+x); //9

		byte a1=10;
		byte b1=20;
		//byte c=a1+b1;max(int,byte,byte)
		byte c=(byte)(a1+b1);
		System.out.println("value of c= "+c); //30

		byte a2=20;
		byte b2=20;
		//b2=b2+1;max(int,byte,int)
		b2=(byte)(b2+1);
		System.out.println("value of c= "+c);
	}
}