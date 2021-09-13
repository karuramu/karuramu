package bufferrwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class A {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			FileWriter f = new FileWriter("D://exp.txt");
			BufferedWriter r= new BufferedWriter(f);
		r.write("asdfg");
		r.newLine();
		r.write("zxcv");
		r.close();
		
		
			
	}catch(Exception e) {
		System.out.println(e);

	}
}
	}

