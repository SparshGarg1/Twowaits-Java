import java.util.Scanner;
class Demo
{
	void fab(int n)
	{
		int arr[] = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<=n; i++)
		{
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println("The fabonacci series is: ");
		for(int i:arr)
		{
		System.out.print(i+" ");
		}
	}
	
	public static void main(String gg[])
	{
		Demo d = new Demo();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Number of elements in fabonacci series: ");
		n = sc.nextInt();
		d.fab(n);
		
	}
}