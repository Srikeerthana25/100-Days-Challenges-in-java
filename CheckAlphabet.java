import java.util.Scanner;
public class Day-1{
 public static void main(String[] args){

  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a character:");
  char val = scan.next().charAt(0);
 
  if ((val >= 'a' && val <='z') || (val >= 'A' && val <='Z') ){
    System.out.println( val + "is alphabet");
}
 else{
 System.out.println( val + "Is not Alphabet");
}
 
 }
}
