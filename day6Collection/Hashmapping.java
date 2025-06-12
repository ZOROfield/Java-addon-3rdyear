package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class Hashmapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>student=new HashMap();
		student.put("Sanjay",50);
		student.put("sakthi", 50);
		student.put("surya", 100);
		
		int total=0;
		for(int totalmarks:student.values()) {
			total+=totalmarks;
		
	}
	System.out.println("Student Total marks="+total);
	double avg=total/student.size();
	
//	avg=total/3;
	System.out.println("Average per="+avg);
	for(Map.Entry<String,Integer> entry:student.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	}
	
	

}
