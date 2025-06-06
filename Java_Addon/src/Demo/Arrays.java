package Demo;

public class Arrays {

	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
int[] arr=new int[5];
  arr[0]=1;
  arr[1]=2;
  arr[2]=3;
  arr[3]=4;
  arr[4]=5;
 
//	System.out.println(arr[1]);
//	for (int i=arr.length-1;i>=0;i--) {
//		System.out.println(arr[i]);
//	}
  int sum=0;
//  int count=0;
  
	for (int i=1;i<=arr.length-1;i++) {
	System.out.println(arr[i]);
	sum=sum+arr[i];
//	count=count+1;
	}
	System.out.println(sum);


	}

	
	
}
