import java.util.Scanner;

public class LcmHcf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no. ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd no. ");
		int num2 = sc.nextInt();
		
		int lcm = (num1 > num2) ? num1 : num2;
		
		while(true) {
			if(lcm %num1 == 0 && lcm%num2 == 0) {
				break;
			}
			lcm ++;
		}
		
		int hcf = (num1*num2) / lcm;
		
		System.out.println("LCM : " + lcm  + " HCF : " + hcf);
		
		
	}

}
