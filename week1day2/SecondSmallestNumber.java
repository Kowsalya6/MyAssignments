package week1day2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		//Find the Second smallest number in the array {23,45,67,32,89,22}
		int[] a={23,45,67,32,89,22};
		Arrays.sort(a);
		System.out.println(a[1]);

	}

}
