package javaExamplePrograms;

public class ContinueStatement {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			if(i==5){
				continue; // when i = 5; it skips that iteration or remaining statements of that iteration
			}
			System.out.println(i); // print the number from 1 to 10
		}	
		System.out.println("Main method");
	}

}
