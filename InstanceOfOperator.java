public class InstanceOfOperator
{
	public static void main(String []args)
	{
		Thread t=new Thread();
		System.out.println(t instanceof Thread); //true
		System.out.println(t instanceof Object); //true
		System.out.println(t instanceof Runnable); //true
		
		//System.out.println(t instanceof String); -> CE:incompatible types, there should some relation b/w argument type
		System.out.println(null instanceof Runnable); // false, null instance X always false

		System.out.println(null instanceof Thread); //false
	}
}