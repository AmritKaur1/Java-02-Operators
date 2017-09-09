class Student{}

class Customer{}

public class NewInstance
{
	public static void main(String[] args)throws Exception
	{
		Object o=Class.forName(args[0]).newInstance();  // newInstance() is used to create obj if we don't know class name at the beginning & it is available at runtime
		System.out.println("object created for :"+o.getClass().getName());
	}
}

  