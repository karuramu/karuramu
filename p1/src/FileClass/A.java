package FileClass;

import java.io.File;
//
public class A {
	public static void main(String[] args) {
		try {
			File file = new File("D://testing.txt");
			file . createNewFile();
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
