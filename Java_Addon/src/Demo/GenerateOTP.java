
package Demo;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class GenerateOTP {
static int OTP() {
	Random ran = new Random();
	return 1000+ ran.nextInt(5000);
}

	public static void main(String[] args) {
		//verify the phone number
		
		System.out.println("enter the phone number to store");
		
Scanner in=new Scanner(System.in);
long num=in.nextLong();
System.out.println("enter the phone number to verify");
long a=in.nextLong();


	if(num==a) {
		System.out.println(" your phone number isa verfied");
		int opt=OTP();
		System.out.println("your otp is "+""+OTP());
	}		
	else
	{
		System.out.println("Invalid phone number");
	}
	
	}
}
