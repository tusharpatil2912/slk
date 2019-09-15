package calendar;
import java.util.Scanner;
public class Calendar {

	
	static boolean isValidDate(int year, int month, int day) { 
	
		 if(month > 12)
         {
             return false;
         }
         else if (year % 4 == 0)
         {
             return true;
         }
         else if (month == 1 || month == 3 || month == 5 || month ==  7 || month ==  8 || month ==  10 || month == 12)
             {
             if (day <= 31)
             {
                 return true;
             }
             else if (day > 31)
             {
                 System.out.println("False.");
             }
         else if (month == 4 || month == 6 || month == 9 || month == 11)
         {
             if (day <= 30)
             {
                 return true;
             }
             else if (day > 30)
             {
                 System.out.println("False.");
             }

         }
         else if (month == 2) // February check
         {
             if (year % 4 == 0) // Leap year check for February
             {
                 if (day <= 29)
                 {
                     return true;
                 }
                 else if (day > 29)
                 {
                     System.out.println("False.");
                 }
             else if (year % 4 != 0)
             {
                 if (day <= 28)
                 {
                     return true;
                 }
                 else if (day > 28)
                 {
                     System.out.println("False.");
                 }
             }
             }
         }
         else // Everything checks out
         {
        	 
        	 return true;
            // System.out.println("True."); 
	
         }
             }
		return true;
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
