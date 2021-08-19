import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int num = sc.nextInt();
		int reverse = 0;
		int digit,n;
		
		//main logic
		while(num!= 0)
		{
			digit = num % 10;
			reverse = (reverse *10)+ digit;
			num = num/10;
		}
		System.out.println("The number after reversing: " + reverse);
	}

}
