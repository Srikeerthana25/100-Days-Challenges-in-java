//Write a program to find Number of days in a given month of a given year
import java.util.Scanner;
public class Findleapyear{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
 System.out.print("Enter the month :");
  int month = sc.nextInt();
 System.out.print("Enter the Year :");
  int year = sc.nextInt();


 if((month == 1) || (month ==3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)){
   System.out.println("31 days");

}

else if(month == 2 && year%4 == 0){
 System.out.println("29days Its leap year");

}


else if(month == 2 ){
 System.out.println("28days");

}

else{
 System.out.println("30days");

}

}
}
