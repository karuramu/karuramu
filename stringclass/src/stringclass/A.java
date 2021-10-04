package stringclass;
/*STRING IS class on java which  consistent of several build in methods using which we can manipulate string data easily 
 * 
 */
public class A {
public static void main(String[] args) {
	String s=" Karthik";
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.trim());
	String s1= "i want konw";
	String[]s2=s1.split(" ");
	System.out.println(s2[0]);
	System.out.println(s2[1]);
	System.out.println(s2[2]);
	System.out.println(s.charAt(4));
}
}

