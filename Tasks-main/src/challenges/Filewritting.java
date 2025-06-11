package Filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class Filewritting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter mywritter=new FileWriter("C://Users//casstudent//Desktop//Java_Addon//sp.txt");
			mywritter.write("files in java might be tricky,butit is fun enough!");
			mywritter.close();
			System.out.println("Successfully wrote the words");
			
		}catch (Exception e) {
			
			System.out.println("An error occured.");
		e.printStackTrace();
		}
	}

}
