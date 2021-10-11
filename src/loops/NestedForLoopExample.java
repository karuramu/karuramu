
/*requirement
1 2 3
1 2 3 
1 2 3
*/



package loops;

public class NestedForLoopExample {
	
	public static void main(String[] args) {
		
		/*for (int i = 1; i <= 3; i++) {   // ensures how many times the inner loop has to be executed
			
			for (int j = 1; j <= 3; j++) {  // used to display values in output screen
				System.out.print( j +" "); 
			}
			System.out.println();
		}*/
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				
				if (i ==3 && j==1) {
					//break;
					System.out.print("  ");
					continue;
				}
				
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
	}

}
