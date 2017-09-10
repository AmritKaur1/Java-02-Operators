public class TernaryOperator
{
	public static void main(String[] args)
	{
		int x=(10<20)?30:40;
		System.out.println(x); //30

		x=(10>20)?30:((40>50)?60:70);
		System.out.println(x); //70
	}
}