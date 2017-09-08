public class RelationalOperator
{
	public static void main(String[] args)
	{
		System.out.println(10<23); //true
		System.out.println('a'<23); //false
		System.out.println('a'<97.7); //true
		System.out.println('a'<'A'); //false
		System.out.println('a'>'A'); //true
		
		//System.out.println(10<23<30);           -> CE:operator < can't be applied to boolean,int
		//System.out.println(true<false);         -> CE:operator < can't be applied to boolean,boolean
		//System.out.println("durga123"<"durga"); -> CE:operator < can't be applied to j.l.String,j.l.String
}
}