package week1.day1;

 public class Calculator {
public void add(int a,int b) {
	 System.out.println(a+b); 
	}
 public void add1(int x,int y,int z) {
		System.out.println(x+y+z);
	}
 public void multiply (int m, int n)
	{
		System.out.println(m*n);	
    }
 public void  multiply1(int p, double r)
 {
	 System.out.println(p*r);
 }
 public void sub(int a, int b) {
	 System.out.println(a-b);
	  }
 public void sub1(double a, double b) {
	 System.out.println(a-b);
 }
public void divide (int a, int b) {
	System.out.println(a/b);
}
public void divide (int a, double b)
{
	System.out.println(a/b);
}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10,20); 
		c.add1(10, 20, 30);
		c.multiply(10, 10);
		c.multiply1(10, 10.5);
		c.sub(10,5);
		c.sub1(10.5, 5.5);
		c.divide(10, 5);
		c.divide(10, 2.5);
	}
}
 
 
 