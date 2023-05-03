package person_details;

import java.util.Scanner;
public class person_details{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your name, your age and your percentage ");
  String name=sc.nextLine();
  int age=sc.nextInt();
  float percentage=sc.nextFloat();
  System.out.println("your name is "+name+" your age is "+age+" your percentage is "+percentage);
  }
}