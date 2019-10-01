package economypack;

public class SwitchDemo {

	public static void main(String[] args) {
		
	String loc="Bang1";
	
	//data types switch supports : byte short int long enum string
	
	switch(loc)
	{
	
	case"Bang1" : System.out.println("Richmond Circle Office....");
	break;
	
	case"Bang2" : System.out.println("St Marks Road Office......");
	break;
	
	case"Bang3" : System.out.println("Electronic City Office....");
	break;
	
	default:System.out.println("You are in wrong city. Please recheck!!!");
	
	}
		

	}

}
