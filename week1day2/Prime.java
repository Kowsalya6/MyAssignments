package week1day2;

public class Prime {

	public static void main(String[] args) {
		int input=30;
		boolean flag= false;
		for(int i=2; i<=input/2;i++) {
			if(input%2==0)
			{
				flag= true;
				break;		
	}
		}
			if(!flag)
			{
				System.out.println("The given is prime number");
			}
			else
			{
				System.out.println("The given number is not a prime number");
			}
}
	
}

