package p1;
import java.util.Scanner;
public class SortNumbers {
	
	
	public static void sortThreeNumbers(int a, int b, int c) { 
		if ((a > b && a > c))
        {
            if(b > c)
            {
                System.out.println(c + " " + b + " " + a);
            }
            else
                System.out.println(b + " " + c + " " + a);
        }
        else if ((b > a && b > c))
        {
            if(a > c)
            {
                System.out.println(c + " " + a + " " + a);
            }
            else
                {
                System.out.println(a + " " + c + " " + b);
                }
        }
        else if ((c > a && c > b))
        {
            if(a > b)
            {
                System.out.println(b + " " + a + " " + c);
            }
            else
                System.out.println(a + " " + b + " " + c);
        }
        else
        {
            System.out.println("ERROR!");
        }
		
	}

	public static void main(String[] args) {
	
		for(int j=0;j<100;j++)
		{
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		sortThreeNumbers(a,b,c);
		
	}

}}
