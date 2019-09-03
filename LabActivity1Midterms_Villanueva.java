import java.util.*;
import java.text.*;

public class LabActivity1Midterms_Villanueva {
    
    public static void main(String[] args)throws Exception {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	try{
    	SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
    	
    
    	System.out.println("Insert the date you were born in this format 'dd-mm-yyyy'");
    	String birthdate = scan.nextLine();
    	Date bdate = format.parse(birthdate);
    	Calendar c = new GregorianCalendar();
    	
    	int year = c.get(Calendar.YEAR);
    	c.setTime(bdate);
    	int byear = c.get(Calendar.YEAR);
    	
    	int age = year - byear;
    		
    	System.out.print("Your age is: " + age);
    	}catch(Exception e){
    		System.out.println("");
    		System.out.print("Please try again and follow the format given");
    		}
    	
    }
}
    	
