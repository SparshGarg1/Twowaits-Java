import java.util.Scanner;
class Demo
{
	public static void main(String gg[])
	{
		float a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		System.out.println("Addition of two number = "+ (a+b));
		System.out.println("Subtraction of two number = "+ (a-b));
		System.out.println("Multiplication of two number = "+ (a*b));
		System.out.println("Division of two number = "+ (a/b));
		
	}
}