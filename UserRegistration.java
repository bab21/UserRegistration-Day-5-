import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	
	public static void main(String[] args){
	   Scanner s=new Scanner(System.in);
		
	  
	   
	   
	   //email validatiom
	   
	   String pattern_phone_number="[0-9]{2}[\\s][0-9]{10}";
	   Pattern p4 = Pattern.compile(pattern_phone_number); 
	   System.out.println("Enter your phone number with country code");
	   String phone_number=s.nextLine();
	   Matcher m4=p4.matcher(phone_number);
	   
	   System.out.println("given phone_number matches(true/false) : "+m4.matches());
	  
	   
	   
	}
}
