public class Armstrong {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int n = sc.nextInt();
		
		int original = n;
		
		int sum=0;
		while(n!=0)
		{
			int digit = n%10;
			sum = sum + digit*digit*digit;
			n=n/10;
		}
		
		if(original == sum)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}

}
