package filereader;

import java.io.FileReader;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader r = new FileReader("D://testing.txt");
			for( int i=0;i<10;i++) {
			System.out.print((char)r.read()); }
			
	}catch(Exception e) {
		System.out.println(e);
	}

}}
