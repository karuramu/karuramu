package filereaderandfile;

import java.io.File;
import java.io.FileReader;
/*Fileclass will helps us to count the number for char in the given file
 * where has Filereader will help us to read content of the file
 * File class in below prg help us to build for loop  dynamically
 */
public class A {

	public static void main(String[] args) {
		try {
	File f=new File("D://testing.txt");
	System.out.println(f.length());
	FileReader file=new FileReader(f);
	for(int i=0;i<f.length();i++) {
		System.out.print((char)file.read());
	}
	
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
