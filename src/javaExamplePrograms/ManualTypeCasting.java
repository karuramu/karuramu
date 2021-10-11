package javaExamplePrograms;

public class ManualTypeCasting {
	
	public static void main(String[] args) {
		
		byte b;
		//boolean bb;
		//int i = 345;
	
		int i = 545;

		b = (byte)i;
		
		System.out.println(b); 
		System.out.println("==================");
		
		// bb = (boolean)i; can not convert from integer type to boolean , compilation error
	}

}
