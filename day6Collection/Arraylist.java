package Collection;
import java.util.ArrayList;;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("gojo");
		arr.add("Computer Science");
		arr.add("3rd year");
		arr.add("heloo");
		arr.add(1,"hi");
		System.out.println(	arr.get(0));
		arr.set(1, arr);
		arr.remove(0);
	for(Object data:arr) {
		System.out.println(data);
	
	}
	
}
}
