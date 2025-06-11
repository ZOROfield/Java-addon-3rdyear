package Filehandling;
import java.io.*;
public class File {


public static void main(String[]args) {

	String filename="C:\\Users\\casstudent\\Desktop\\Java_Addon//addon notes.txt";
	try(BufferedReader br=new BufferedReader(new FileReader(filename))){
		String Line;
		if((Line=br.readLine())!=null)
		{
			System.out.println(Line);
		}
	}
	catch(Exception e){
		System.out.println("filenotfound");
	}
}
}