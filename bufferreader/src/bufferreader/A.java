package bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;

//FileClass can use with fileReader and FileWriter but than it can't use with BufferedReader and BufferedWriter
// BufferedReader is used to increase the performance can also read the data line by line
//BufferedReader will used for to increase the performance of the file to read & write 
public class A {
	public static void main(String[] args) {

	// TODO Auto-generated method stub
	try {
		FileReader f = new FileReader("D://testing.txt");
		BufferedReader r= new BufferedReader(f);
		System.out.println(r.readLine());
		
}catch(Exception e) {
	System.out.println(e);

}
	
}
	}