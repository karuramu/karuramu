package javaExamplePrograms;

public class SwitchStatementExample {
	
	public static void main(String[] args) {
		
		int i =5, j = 1;
		//int x=1, y=6;
		
		 switch (i+j) {
		case 1:
		case 2:
		case 3:
			System.out.println("Number less then 4");
			break;

		case 4:
		case 5:
		case 6:
		//case x+y: Case label can have variable expression. it gives compilation error 
			System.out.println("Number less then 3");
			
		}
	}

}
