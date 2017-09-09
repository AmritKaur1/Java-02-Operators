public class BitwiseOperator
{
	public static void main(String[] args)
	{
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(true | false); //true
		System.out.println(true ^ false); //true

		//System.out.println(~true); -> CE:operator ~ can't be applied to boolean
		System.out.println(~4);//-5

		//System.out.println(!4); -> CE:operator ! can't be applied to int
		System.out.println(!false);//t
	}
}