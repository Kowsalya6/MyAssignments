package week1day2;

public class Palindrome {

	public static void main(String[] args)
	{    
		int num=6587; 
		int n=num;
		int sum=0;
		for(;n!=0;n/=10)
		{
			int a=n%10;
			sum=(sum*10)+a;
			
		}
		
		
	if(sum==num)    
			System.out.println("Number is palindrome ");    
		else    
			System.out.println("Number is not palindrome");    

	}
 
}