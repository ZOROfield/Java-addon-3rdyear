package Collection;
import java.util.HashSet;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>email=new HashSet();
		email.add("abc@gmail.com");
		email.add("egf@gmail.com");
		email.add("hij@gmail.com");
		for(String data:email) {
			System.out.println(data);
		}
	
	}

}
