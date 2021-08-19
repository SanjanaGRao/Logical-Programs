import java.util.Scanner;

public class StopWatchPoblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Asking the user to enter start and stop time
		System.out.println("Enter Start Time in Hrs:Min:Sec format: ");
		int hr1 = sc.nextInt();
		int min1 = sc.nextInt();
		int sec1 = sc.nextInt();
		System.out.println("Enter Stop Time in Hrs:Min:Sec format: ");
		int hr2 = sc.nextInt();
		int min2 = sc.nextInt();
		int sec2 = sc.nextInt();
		//checking for valid cases
		if( (hr1>24 || hr2 > 24)  || (min1 >60 || min2 >60) || (sec1>60 || sec2>60) )
			System.out.println("Invalid case. Please Enter proper timings.");
		else
		{
			// Calculating Elapsed time
			long differenceInSec = (long) (Math.abs(sec2 - sec1));
			long differenceInMin = (long) ((Math.abs(min2 - min1)));
			long differenceInHrs = (long) ((Math.abs(hr2 - hr1)));
			//Printing
			System.out.println("Elapsed Time (Hrs:Min:Sec): ");
		    System.out.println(differenceInHrs + ":" + differenceInMin + ":" + differenceInSec);
		    		
		}
		
	}

}
