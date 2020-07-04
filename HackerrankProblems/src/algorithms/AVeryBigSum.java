package algorithms;

import java.util.Scanner;

public class AVeryBigSum {
	
	public static long aVeryBigSum(long arr[])
	{
		long sum=0;
		for(int i=0;i<arr.length;++i)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLong();
		}
		System.out.println(aVeryBigSum(arr));
		
	}

}
