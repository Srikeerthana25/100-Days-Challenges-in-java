//Day-3
//Get an input character from the user and give the ASCII value of the given input as the output.

import java.util.Scanner;
public class Findascii{
 public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter a character");
 char value = scan.next().charAt(0);
 int ascii = value;
 System.out.println(ascii);
}
}