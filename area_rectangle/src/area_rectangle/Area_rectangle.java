package area_rectangle;

import java.util.Scanner;
public class Area_rectangle{
	  public static void main(String[] args){
	  Scanner sc =new Scanner(System.in);
	    System.out.println("enter the length and bredth of rectangle");
	    int len = sc.nextInt();
	    int bredth = sc.nextInt();
	    int area;
	    area=len*bredth;
	    System.out.println("area of rectangle is "+area);
	  }
	  
	}
