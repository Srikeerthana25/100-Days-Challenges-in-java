import java.util.Scanner;

public class number{
 
 public static void main(String[] args){

  Scanner get = new Scanner(System.in);
  System.out.println("Enter the number");
  int num = get.nextInt();
  
  int number = 0;

  while(num!=0){
   ++number;
   num = num/10;
 }
 
System.out.println(number);

}

}