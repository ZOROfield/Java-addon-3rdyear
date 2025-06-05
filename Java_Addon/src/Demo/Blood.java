package Demo;

import java.util.Scanner;

public class Blood {

	public static void main (String[]args) {
System.out.println("Enter the weight:");
System.out.println("Enter the age:");
Scanner in= new Scanner(System.in);
int weight= in.nextInt();
int age =in.nextInt();
System.out.println(weight);
if(weight>50 && age>=18 ) {
	System.out.println("you are eligible");
}
else {
	System.err.println("you are not eligible");
}
	
	}

}
