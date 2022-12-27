package week1day2;

public class FibonnaciSeries {

	public static void main(String[] args) {
	
		int firstNum=0;
		int secNum=1;
		int sum;
		System.out.println(firstNum);
		
		for(int i=0;i<8;i++)
		{
		sum=firstNum+secNum;		
		System.out.println(sum);
		firstNum=secNum;
		secNum=sum;
		}
}
}