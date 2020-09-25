import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration{
	
	public static void main(String[] args){
	   Scanner s=new Scanner(System.in);
		
       String pattern_first_name="[A-Z][a-z]{2,}";
	   Pattern p = Pattern.compile(pattern_first_name); 
	   
	   String first_name=s.nextLine();
	   Matcher m1=p.matcher(first_name);
	   
	   System.out.println("given word matches(true/false) : "+m1.matches());
	}
}