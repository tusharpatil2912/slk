package check;

public class CheckPrime {

	public static void main(String[] args) {
	
	int num=3;
	int ct=0;
	
	for(int i=1;i<=num;i++)
	{
		if(num%i == 0)
		{
			ct++;
		}
	}

	if(ct==2)
	{
		System.out.println(num+" is prime");
	}
	else
	{
		System.out.println(num+" is composite");
	}
	}

}
