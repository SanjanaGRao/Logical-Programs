
public class CouponNumber {

	public static void main(String[] args) {

		char[] charAvail="123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray(); //Valid Coupon Codes
		int max=100000000;
		int randomNo=(int) (Math.random()*max);	//to generate random codes
		StringBuffer sb=new StringBuffer();
		
		//generation of random Coupon Number
		while (randomNo>0)
		{
			sb.append(charAvail[randomNo % charAvail.length]); 
			randomNo /= charAvail.length;
		}

		String code=sb.toString();
		System.out.println("Therefore the Coupon Number is: "+code);
	}

}
