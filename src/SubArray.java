import java.util.*;
public class SubArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		  int n=sc.nextInt();
		  System.out.println("Enter k");
		 int k=sc.nextInt(); 
		 int arr[]=new int[n];
		 System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		
			arr[i]=sc.nextInt();
			int count=0;
			n=n-k+1;
			count=n*(n+1)/2;
			System.out.print("Number of sub arrays:"+count);
		
		
		
		
		
	}

}





 