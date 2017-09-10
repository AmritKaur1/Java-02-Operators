public class OperatorPrecedence
{
	public static void main(String[] args)
	{
		System.out.println(m1(1)+m1(2)+m1(3)+m1(4)+m1(5)+m1(6)); //operand will be evaluted from left to right before applying any operator
		int a=1+2*3/4+5*6; //operator precedence
		System.out.println(a);
	}
	public static int m1(int i)
	{
		return i;
	}
}