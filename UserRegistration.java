import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	
	public static void main(String[] args){
	   Scanner s=new Scanner(System.in);
		
	  
	   
	   
	   //email validatiom
	   
	   String pattern_password=".{8,}";
	   Pattern p5 = Pattern.compile(pattern_password); 
	   System.out.println("Enter your password");
	   String password=s.nextLine();
	   Matcher m5=p5.matcher(password);
	   
	   System.out.println("given password matches(true/false) : "+m5.matches());
	   
	  
	   
	   
	}
}
