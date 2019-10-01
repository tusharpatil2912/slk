package sixpack;
import java.util.Scanner;
public class AllPrimes {

	public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the range::");
	int num=s.nextInt();  //read the range into num
	int ct=0;
	for(int i=2;i<=num;i++)
	{
		ct=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{	
			ct++;
		}
		}
   if(ct==2)
    {
	   System.out.print(i+"\t");
    }
	}
	}

}
