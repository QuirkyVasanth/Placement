package day2;

public class Static_NonStatic {

	int a=10;   //--------------------Non-static
	static int b=56;  //------------- Static Variable
	
	
	
	public static void run()   //----------static Method
	{
		int number=890;//--------cant access because it is declared as Local Variable
		System.out.println("Static Method");
	}
	
	public void run1()         //------------------Non-Static Method
	{
		System.out.println("Non-Static Method");
	}
	
	
	public static void main(String[] args) {
		System.out.println(b);//---- declared as static, so no need any Object.
		run();//--------------------declared as static, so no need any Object.

		Static_NonStatic s1=new Static_NonStatic();//---Object Creation
		System.out.println(s1.a);//-------Accessing a variable with OBject since it is non static.
		s1.run1();//-----------------Accessing a variable with Object since it is non static.
		
		
		
		
	}
}
