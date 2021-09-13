package finallykeyword;
/*finally is extension of try catch block
 * any thing kept in finally will exc regardless of exception
 */
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=10/0;
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("I will always writen");
		}

	}

}
