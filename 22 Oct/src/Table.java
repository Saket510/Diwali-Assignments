import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int num = sc.nextInt();
		int i;
		for(i=1;i<=10;i++) {
			int sum = num*i;
			System.out.println(num + "*" + i + "=" + sum  );
			
		}
		
	}
}
