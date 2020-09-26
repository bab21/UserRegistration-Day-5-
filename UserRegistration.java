import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	
	public static void main(String[] args){
	   Scanner s=new Scanner(System.in);
		
	  
	   
	   
	   //email validatiom
	   String pattern_email="^[a-z0-9A-Z]+(([\\.+-][a-z0-9]{1,})?)+@[a-z0-9A-Z]+\\.([a-z]{2,6})+((\\.[a-zA-Z]{2,6})?)$";
	   
	   
	   
	   Pattern p3= Pattern.compile(pattern_email); 
	   System.out.println("Enter your email");
	   String email=s.nextLine();
	   Matcher m3=p3.matcher(email);
	   
	   System.out.println("given mail matches(true/false) : "+m3.matches());
	   
	  
	   
	   
	}
}
