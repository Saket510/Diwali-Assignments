import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int n = sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum= sum + i*2;
		}
		
		System.out.println("Sum of first n even number is "+ sum);
	}

}
