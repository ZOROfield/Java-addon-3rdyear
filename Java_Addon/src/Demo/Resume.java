package Demo;

import java.util.Scanner;

public class Resume {

	public Resume() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner in= new Scanner(System.in);
		String name=in.nextLine();
		
		System.out.println("Enter the Contact number:");
		long num=in.nextLong();
		
		System.out.println("Enter the EmailID");
		String mail=in.next();
		
		in.nextLine();
		
		System.out.println("Enter the Address");
		String address=in.nextLine();
		
		System.out.println("Enter the skill set");
		String skill=in.nextLine();
			
		System.out.println("Enter the project descrpt");
		String project=in.nextLine();
	}

}
