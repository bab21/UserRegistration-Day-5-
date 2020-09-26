import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	
	public static void main(String[] args){
	   Scanner s=new Scanner(System.in);
		
	  
	   
	   
	   //email validatiom
	   
	   String pattern_password="(?=.*[0-9])(?=.*[A-Z]).{8,}";
	  
	   Pattern p6 = Pattern.compile(pattern_password); 
	   System.out.println("Enter your password");
	   String password=s.nextLine();
	   Matcher m6=p6.matcher(password);
	   
	   System.out.println("given password matches(true/false) : "+m6.matches());
	   
	  
	   
	   
	}
}
