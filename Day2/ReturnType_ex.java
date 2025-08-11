package day2;

public class ReturnType_ex {

	public static void add()
	{
		
	}
	
	public static  int callme()
	{
		return 10;
	}
	
	public static  String Data()
	{
		return "abcd";
	}
	
	public static void main(String[] args) {
	
		add();
		System.out.println(callme());//-------------->returning and printing the value 10 
		System.out.println(Data());//---return type string so returning and printing string data
		
		
	}
}
