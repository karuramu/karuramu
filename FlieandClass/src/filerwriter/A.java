package filerwriter;

import java.io.FileWriter;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter r = new FileWriter("D://testing.txt");
			r.write("xyz");
			r.close();//FileWriter should be close to write in the txt 
			
	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
