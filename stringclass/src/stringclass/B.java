package stringclass;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gadagk";
		int j = s.length() - 1;
		int size = s.length() - 1;
		String reverse="";
		// int size1=s.length();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(j)) {
				// System.out.print(s.charAt(j));
				--j;

				if (i == size) {
					System.out.println("palindrome");
				}

			}

			else {
				System.out.println("this is not palindrome");
				for (int k = size; k >= 0; k--) // k== size bcz size value is 5
				{	System.out.println(s.charAt(k));
					reverse=reverse + s.charAt(k);
					
					System.out.println(reverse);
				} // the above for loop is used for reverse the string
					// with out using built in method
				break;
			}
		}

	}
}
