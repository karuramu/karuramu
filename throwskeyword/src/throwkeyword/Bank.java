package throwkeyword;

public class Bank {

	public static void main(String[] args) { 
		 int bal=5000;
		 int  amt=10000;
		 if(amt>bal) {
			 try { 
			 throw new InsufficientFunds();
			 }catch(InsufficientFunds e) {
				 System.out.println(e);
			 }
		 }

	}

}
