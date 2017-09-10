public class StringOperator
{
	public static void main(String[] args)
	{
		String a="prabhu";
		int b=10;
		int c=20;
		int d=30;
		
		System.out.println(a+b+c+d); //prabhu102030
		System.out.println(b+c+d+a); //60prabhu
		System.out.println(b+a+c+d); //10prabhu2030
		System.out.println(b+c+a+d); //30prabhu10
		
		//a=b+c+d;incompatible type
		//System.out.println(a);
		
		a=a+c+d;
		System.out.println(a); //prabhu2030
		
		//b=a+d+c;incompatible type
		
		b=b+c+d;
		System.out.println(b); //60
	}
}