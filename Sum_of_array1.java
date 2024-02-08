import java.util.Scanner;
class Sum_of_array1
{
	public static void main(String args[])
	{
		System.out.println("Enter the size of the array:");
		Scanner ar=new Scanner(System.in);
		int n = ar.nextInt();
		int a[]= new int[n];
		int sum=0;
		System.out.println("enter the values");
		for(int i=0;i<n;i++)
		{
			a[i] = ar.nextInt();
			sum = sum + a[i];
		}
		System.out.println("sum: "+sum);
	}
}
