package p1;

public class Demo {

	public static void main(String[] args) {
	
	int val=20;
	System.out.println(val > 10);
	int val1=20;
	System.out.println(val == val1);
	int val2=21;
	System.out.println(val1 != val2);
	
	System.out.println(val1 == val2);

	System.out.println(val2 <= 21);

	System.out.println("--------------------------");
	
	int a=100,b=50;
	
	 //+,-,*,/,%
	System.out.println("Modulus = "+(a%b));
	System.out.println("Subtraction = "+(a-b));
	System.out.println("Multiplication = "+(a*b));
	System.out.println("Addition = "+(a+b));
	System.out.println("Division = "+(a/b));

	}

}
