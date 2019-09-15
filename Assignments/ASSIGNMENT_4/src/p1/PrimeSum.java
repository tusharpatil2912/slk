package p1;
import java.util.Scanner;
public class PrimeSum {

	 static boolean checkPrime(int num) 
	    { 
		 int ct=0;
			
			for(int v=1;v<=num;v++)
			{
					if( num%v == 0)
				   {
					ct++;
				   }
				
			}
			
			if( ct == 2)
			{
				return true;
			}
			else
				return false;
		 
	    } 
	  
	    
	    public static int sumOfPrimes(int from, int to) 
	    { 
	        int sum = 0; 
	        for (int i = from; i <= to; i++) { 
	  
	            // Check for prime 
	            boolean isPrime = checkPrime(i); 
	            if (isPrime) { 
	  
	                // Sum the prime number 
	                sum = sum + i; 
	               // System.out.println(sum);
	            } 
	            
	        } 
	        System.out.println(sum);
	       return sum; 
	    } 
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int from = sc.nextInt();
		int to = sc.nextInt();
		sumOfPrimes(from,to);
		
	}

}
