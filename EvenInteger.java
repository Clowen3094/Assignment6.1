//Declare an integer array of size 10. Initialize using for loop with 1 to 10, and print all even numbers from an array.
import java.util.*;
public class EvenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring an integer array of size 10
		int arr[] = new int[10];
		
		
		for(int i=0;i<10;i++)
		{
			arr[i]=i+1;
			
		}
		// to check and print the even integers in array
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even integers in array :"+arr[i]);
			}
			
			
	    }
		
	
	}

}