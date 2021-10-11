package loops;

public class ElseIfLadder {
	
	public static void main(String[] args) {
		
		int base = 2;
		
		if (base == 2) {
			System.out.println("Binary system");
		} else if( base == 8){
			
			System.out.println("Octal system");
		}else if( base == 10){
			
			System.out.println("Decimal system");
		}else if( base == 16){
			
			System.out.println("Hexa-Decimal system");
		}
		else{
			System.out.println("i dont know");
		}
	}

}
