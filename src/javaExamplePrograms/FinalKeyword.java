package javaExamplePrograms;

public class FinalKeyword {
	
	public static void main(String[] args) {
		
		final double PI = 3.1428;
		//PI = PI + 0.0; we can not reassign the constant variable or final variable, compilation error
		//once the final variable is assigned it can not be modified
		
		float r = 2.5F;
		double result = PI*r*r;
		
		System.out.println(result);
		
//		final double PI;
//		PI = 3.1428;
//		float r = 2.5F;
//		double result = PI*r*r;
//		
//		System.out.println(result);
		
	}

}
