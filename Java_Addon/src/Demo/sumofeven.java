package Demo;

public class sumofeven {

	public sumofeven() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] arr=new int[5];
		  arr[0]=1;
		  arr[1]=2;
		  arr[2]=3;
		  arr[3]=4;
		  arr[4]=5;
int sum=0;
			for (int i=0;i<=arr.length-1;i++) {
//			System.out.println(arr[i]);
			
			if(arr[i]%2==0) {
				System.out.println(sum);
			}
			sum=sum+arr[i];
			
			}
	}

}
