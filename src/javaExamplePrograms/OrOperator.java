package javaExamplePrograms;

public class OrOperator {
	public static void main(String[] args) {
		double perc = 75.00;
		char grade = 'A';
		
		//logical OR operation
		if (perc >= 75.00 | grade == 'A') {  
			System.out.println("Good");
		}
			//Short circuit OR operation
			if (perc >= 75.00 || grade == 'A') {
				System.out.println("Good");
			
		}
	}

}
