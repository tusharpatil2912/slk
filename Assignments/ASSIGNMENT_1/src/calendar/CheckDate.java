package calendar;

import java.util.Scanner;

public class CheckDate {

	
	static boolean isValidDate(int year, int month, int day) { 
		
		if(month>=1 && month <=12)
		{
			if(month==2)
			{	
				if(day>=1 && day<=28)
				{
					return true;
				}
				else 
				{
					return false;
				}
			}
			else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 )
			{
				if(day>=1 && day<=31)
				{
					return true;
				}
				else 
				{
					return false;
				}
				
			}
			else
			{
				if(day>=1 && day<=31)
				{
					return true;
				}
				else 
				{
					return false;
				}
				
			}
			
		}
		
		else
		return false; 
	}

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int year;
		int month;
        int day;
       
        System.out.println("Enter your year:");
        year = sc.nextInt();
        System.out.println("Enter your month:");
        month = sc.nextInt();
        System.out.println("Enter your day:");
        day = sc.nextInt();
        
		System.out.println(Calendar.isValidDate(year, month, day));

	}

}
