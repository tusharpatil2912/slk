package prime;
import java.util.Scanner;
public class PrimeNumber {

	static boolean isPrimeNumber(int num) { 
        
		int ct=0;
		
		for(int i=1;i<=num;i++)
		{
				if( num%i == 0)
			   {
				ct++;
			   }
			
		}
		
		if( ct == 2)
		{
			System.out.println(num+" is prime!!!");
		}
		else
		{
			
			System.out.println(num+" is composite!!!");	
			
		}
		return false; 
	}
	
	
	public static void main(String[] args) {
		for(int j=0;j<10;j++)
		{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		isPrimeNumber(num);
		}
	}

}
