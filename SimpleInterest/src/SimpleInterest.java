import java.util.Scanner;

public class SimpleInterest {

	
	  public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the principle amount,       time, rate");
	    int principle_amount=sc.nextInt();
	      int time=sc.nextInt();
	    int rate=sc.nextInt();
	    int interest;
	    interest= ((principle_amount*time*rate)/100);
	    System.out.println("interest is "+interest);
	      
	      
	  }
	}