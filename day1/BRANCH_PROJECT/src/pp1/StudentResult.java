package pp1;

public class StudentResult {

	public static void main(String[] args) {
		
	int sub1=43,sub2=50,sub3=55;	
		
	int sum=(sub1+sub2+sub3);
	
	double avg=(double)(sum/3);
	
	if((avg>80)&&(avg<=100))
		System.out.println("Distinction");
	else if((avg>60)&&(avg<=80))
		System.out.println("First Class");
	else if((avg>40)&&(avg<=60))
		System.out.println("Second Class");
	else 
		System.out.println("Failed");

	}

}
