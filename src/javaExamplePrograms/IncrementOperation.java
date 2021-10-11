package javaExamplePrograms;

public class IncrementOperation {
	public static void main(String[] args) {
		
		int x =1;
		// pre increment
		System.out.println("===pre increment====");

		System.out.println(++x); // o/p = 2
		
		x = 1;
		int result = 10 + ++x; 
		System.out.println(result); //o/p = 12
		
		//post increment
		System.out.println("===post increment====");
		x = 1;
		System.out.println(x++); // o/p = 1
		System.out.println(x);  // o/p = 2
		
		x = 1;
		result = 10 + x++; 
		System.out.println(result); //o/p = 11
		
System.out.println("=================");
		
		int i = 1;//2  3  4   5
		 result = ++i*++i*++i*++i;
		 System.out.println(result);
		 
		  i = 1;// 1   2   3  4
		 result = i++*i++*i++*i++;
		 System.out.println(result);
		 
		 i = 1; //2    2  4    4
		 result = ++i*i++*++i*i++;
		 System.out.println(result);
	}

}
